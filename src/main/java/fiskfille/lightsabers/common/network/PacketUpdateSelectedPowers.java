package fiskfille.lightsabers.common.network;

import io.netty.buffer.ByteBuf;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import com.google.common.collect.Lists;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fiskfille.lightsabers.Lightsabers;
import fiskfille.lightsabers.common.data.DataManager;
import fiskfille.lightsabers.common.power.Power;

public class PacketUpdateSelectedPowers implements IMessage
{
    public int id;
    private List<Power> selectedPowers;

    public PacketUpdateSelectedPowers()
    {

    }

    public PacketUpdateSelectedPowers(EntityPlayer player, List<Power> list)
    {
        id = player.getEntityId();
        selectedPowers = list;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        id = buf.readInt();
        selectedPowers = Lists.newArrayList();
        int i = buf.readInt();

        if (i > 0)
        {
            for (int j = 0; j < i; ++j)
            {
                selectedPowers.add(Power.getPowerFromName(ByteBufUtils.readUTF8String(buf)));
            }
        }
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(id);
        buf.writeInt(selectedPowers.size());

        for (Power power : selectedPowers)
        {
            if (power != null)
            {
                ByteBufUtils.writeUTF8String(buf, power.getName());
            }
            else
            {
                ByteBufUtils.writeUTF8String(buf, "");
            }
        }
    }

    public static class Handler implements IMessageHandler<PacketUpdateSelectedPowers, IMessage>
    {
        @Override
        public IMessage onMessage(PacketUpdateSelectedPowers message, MessageContext ctx)
        {
            List<Power> list = message.selectedPowers;

            if (ctx.side.isClient())
            {
                EntityPlayer player = Lightsabers.proxy.getPlayer();
                Entity entity = player.worldObj.getEntityByID(message.id);

                if (entity instanceof EntityPlayer)
                {
                    EntityPlayer player1 = (EntityPlayer) entity;
                    DataManager.setSelectedPowersWithoutNotify(player1, list);
                }
            }
            else
            {
                EntityPlayer player = ctx.getServerHandler().playerEntity;

                if (player != null)
                {
                    Entity entity = player.worldObj.getEntityByID(message.id);

                    if (entity instanceof EntityPlayer)
                    {
                        EntityPlayer player1 = (EntityPlayer) entity;
                        DataManager.setSelectedPowers(player1, list);
                    }
                }
            }

            return null;
        }
    }
}
