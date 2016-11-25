package fiskfille.lightsabers.common.proxy;

import net.ilexiconn.llibrary.server.network.AbstractMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fiskfille.lightsabers.Lightsabers;
import fiskfille.lightsabers.common.block.ModBlocks;
import fiskfille.lightsabers.common.entity.ModEntities;
import fiskfille.lightsabers.common.event.CommonEventHandler;
import fiskfille.lightsabers.common.generator.ModChestGen;
import fiskfille.lightsabers.common.item.ModItems;
import fiskfille.lightsabers.common.lightsaber.LightsaberManager;
import fiskfille.lightsabers.common.recipe.ModRecipes;

public class CommonProxy
{
	public void preInit()
	{
		LightsaberManager.register();
		ModItems.register();
		ModBlocks.register();
		ModRecipes.register();
		ModEntities.register();
		ModChestGen.register();
		
		registerEventHandler(new CommonEventHandler());
		
		if (Lightsabers.isDynamicLightsLoaded)
		{
			fiskfille.lightsabers.common.event.CommonEventHandlerDL eventHandler = new fiskfille.lightsabers.common.event.CommonEventHandlerDL();
			eventHandler.load();
			registerEventHandler(eventHandler);
		}
	}

	public void init()
	{
		
	}
	
	public void registerEventHandler(Object obj)
    {
        MinecraftForge.EVENT_BUS.register(obj);
        FMLCommonHandler.instance().bus().register(obj);
    }

	public EntityPlayer getPlayer()
	{
		return null;
	}

	public boolean isClientPlayer(EntityPlayer player)
	{
		return false;
	}
	
	public float getPartialTicks()
	{
		return 0;
	}
	
	public <T extends AbstractMessage<T>> void handleMessage(final T message, final MessageContext messageContext)
	{
        message.onServerReceived(FMLCommonHandler.instance().getMinecraftServerInstance(), message, messageContext.getServerHandler().playerEntity, messageContext);
    }
}
