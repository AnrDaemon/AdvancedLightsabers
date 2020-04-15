package com.fiskmods.lightsabers.client.model.lightsaber;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEmitterMechanical extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer guard1;
    public ModelRenderer guard3;
    public ModelRenderer guard4;
    public ModelRenderer guard5;
    public ModelRenderer guard6;
    public ModelRenderer panel1;
    public ModelRenderer panel2;
    public ModelRenderer frontButton1;
    public ModelRenderer body2;
    public ModelRenderer body6;
    public ModelRenderer body10;
    public ModelRenderer body12;
    public ModelRenderer body13;
    public ModelRenderer body15;
    public ModelRenderer body19;
    public ModelRenderer body28;
    public ModelRenderer body29;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer body9;
    public ModelRenderer body11;
    public ModelRenderer body14;
    public ModelRenderer body16;
    public ModelRenderer body17;
    public ModelRenderer body18;
    public ModelRenderer body20;
    public ModelRenderer body21;
    public ModelRenderer body22;
    public ModelRenderer guard2;
    public ModelRenderer frontButton2;
    public ModelRenderer frontButton3;

    public ModelEmitterMechanical()
    {
        textureWidth = 64;
        textureHeight = 32;
        body28 = new ModelRenderer(this, 0, 30);
        body28.setRotationPoint(-0.8F, -19.76F, 3.1F);
        body28.addBox(-1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(body28, 0.296705972839036F, -0.2617993877991494F, -0.20943951023931953F);
        body12 = new ModelRenderer(this, 0, 0);
        body12.setRotationPoint(0.0F, 0.0F, 0.0F);
        body12.addBox(-1.5F, -15.0F, 2.62F, 3, 15, 1, 0.0F);
        setRotateAngle(body12, 0.0F, 3.141592653589793F, 0.0F);
        body16 = new ModelRenderer(this, 8, 19);
        body16.setRotationPoint(-0.91F, -15.19F, 3.12F);
        body16.addBox(0.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
        setRotateAngle(body16, 0.0F, 0.0F, -0.6283185307179586F);
        guard1 = new ModelRenderer(this, 34, 17);
        guard1.setRotationPoint(0.0F, -12.0F, -2.5F);
        guard1.addBox(-4.0F, -1.0F, 0.0F, 8, 2, 7, 0.0F);
        body10 = new ModelRenderer(this, 8, 0);
        body10.mirror = true;
        body10.setRotationPoint(0.0F, 0.0F, 0.0F);
        body10.addBox(-1.5F, -15.0F, 2.62F, 3, 15, 1, 0.0F);
        setRotateAngle(body10, 0.0F, 2.356194490192345F, 0.0F);
        body18 = new ModelRenderer(this, 4, 21);
        body18.setRotationPoint(-0.8F, -0.2F, 0.0F);
        body18.addBox(-0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        body11 = new ModelRenderer(this, 0, 19);
        body11.mirror = true;
        body11.setRotationPoint(1.16F, -14.06F, 3.12F);
        body11.addBox(-3.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
        setRotateAngle(body11, 0.0F, 0.0F, 0.33161255787892263F);
        body13 = new ModelRenderer(this, 8, 0);
        body13.setRotationPoint(0.0F, 0.0F, 0.0F);
        body13.addBox(-1.5F, -15.0F, 2.62F, 3, 15, 1, 0.0F);
        setRotateAngle(body13, 0.0F, -2.356194490192345F, 0.0F);
        body5 = new ModelRenderer(this, 8, 21);
        body5.mirror = true;
        body5.setRotationPoint(0.0F, 1.0F, 0.0F);
        body5.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        frontButton3 = new ModelRenderer(this, 41, 0);
        frontButton3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton3.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton3, 0.0F, -2.1816615649929116F, 0.0F);
        body22 = new ModelRenderer(this, 8, 21);
        body22.setRotationPoint(0.0F, 1.0F, 0.0F);
        body22.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        guard3 = new ModelRenderer(this, 44, 21);
        guard3.setRotationPoint(-2.6F, -13.0F, -3.94F);
        guard3.addBox(0.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F);
        body7 = new ModelRenderer(this, 8, 19);
        body7.mirror = true;
        body7.setRotationPoint(0.91F, -15.19F, 3.12F);
        body7.addBox(-3.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
        setRotateAngle(body7, 0.0F, 0.0F, 0.6283185307179586F);
        guard6 = new ModelRenderer(this, 40, 17);
        guard6.setRotationPoint(-4.0F, -11.0F, 2.5F);
        guard6.addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        body4 = new ModelRenderer(this, 0, 24);
        body4.mirror = true;
        body4.setRotationPoint(0.13F, -0.94F, 0.0F);
        body4.addBox(0.0F, -0.5F, -0.5F, 1, 3, 1, 0.0F);
        setRotateAngle(body4, 0.0F, 0.0F, -0.767944870877505F);
        body17 = new ModelRenderer(this, 0, 21);
        body17.setRotationPoint(1.0F, -15.9F, 3.12F);
        body17.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        frontButton2 = new ModelRenderer(this, 41, 0);
        frontButton2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton2.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton2, 0.0F, 2.1816615649929116F, 0.0F);
        body2 = new ModelRenderer(this, 24, 0);
        body2.mirror = true;
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -18.0F, 2.62F, 3, 18, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        body29 = new ModelRenderer(this, 0, 30);
        body29.mirror = true;
        body29.setRotationPoint(0.8F, -19.76F, 3.1F);
        body29.addBox(-1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(body29, 0.296705972839036F, 0.2617993877991494F, 0.20943951023931953F);
        guard2 = new ModelRenderer(this, 44, 21);
        guard2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        guard2.addBox(0.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        setRotateAngle(guard2, 0.0F, 0.7958701389094143F, 0.0F);
        body1 = new ModelRenderer(this, 32, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, -20.0F, 2.62F, 3, 20, 1, 0.0F);
        guard5 = new ModelRenderer(this, 40, 10);
        guard5.setRotationPoint(-4.0F, -11.12F, 0.38F);
        guard5.addBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F);
        setRotateAngle(guard5, 0.7853981633974483F, 0.0F, 0.0F);
        body9 = new ModelRenderer(this, 4, 21);
        body9.mirror = true;
        body9.setRotationPoint(0.8F, -0.2F, 0.0F);
        body9.addBox(-0.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        frontButton1 = new ModelRenderer(this, 41, 0);
        frontButton1.setRotationPoint(1.8F, -6.0F, 2.0F);
        frontButton1.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton1, 1.5707963267948966F, -2.356194490192345F, 0.0F);
        panel2 = new ModelRenderer(this, 26, 22);
        panel2.setRotationPoint(-1.0F, -16.0F, 3.0F);
        panel2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        body14 = new ModelRenderer(this, 0, 19);
        body14.setRotationPoint(-1.16F, -14.06F, 3.12F);
        body14.addBox(0.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
        setRotateAngle(body14, 0.0F, 0.0F, -0.33161255787892263F);
        body8 = new ModelRenderer(this, 0, 21);
        body8.mirror = true;
        body8.setRotationPoint(-1.0F, -15.9F, 3.12F);
        body8.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        body21 = new ModelRenderer(this, 0, 24);
        body21.setRotationPoint(-0.13F, -0.94F, 0.0F);
        body21.addBox(-1.0F, -0.5F, -0.5F, 1, 3, 1, 0.0F);
        setRotateAngle(body21, 0.0F, 0.0F, 0.767944870877505F);
        guard4 = new ModelRenderer(this, 44, 21);
        guard4.setRotationPoint(2.61F, -13.0F, -3.94F);
        guard4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        setRotateAngle(guard4, 0.0F, -0.8028514559173915F, 0.0F);
        body6 = new ModelRenderer(this, 16, 0);
        body6.mirror = true;
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, -16.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body6, 0.0F, 1.5707963267948966F, 0.0F);
        body3 = new ModelRenderer(this, 4, 23);
        body3.mirror = true;
        body3.setRotationPoint(-1.0F, -18.0F, 3.12F);
        body3.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        body19 = new ModelRenderer(this, 24, 0);
        body19.setRotationPoint(0.0F, 0.0F, 0.0F);
        body19.addBox(-1.5F, -18.0F, 2.62F, 3, 18, 1, 0.0F);
        setRotateAngle(body19, 0.0F, -0.7853981633974483F, 0.0F);
        body20 = new ModelRenderer(this, 4, 23);
        body20.setRotationPoint(1.0F, -18.0F, 3.12F);
        body20.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        panel1 = new ModelRenderer(this, 26, 22);
        panel1.setRotationPoint(-1.0F, -9.0F, 3.0F);
        panel1.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        body15 = new ModelRenderer(this, 16, 0);
        body15.setRotationPoint(0.0F, 0.0F, 0.0F);
        body15.addBox(-1.5F, -16.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body15, 0.0F, -1.5707963267948966F, 0.0F);
        body1.addChild(body28);
        body1.addChild(body12);
        body15.addChild(body16);
        body1.addChild(body10);
        body17.addChild(body18);
        body10.addChild(body11);
        body1.addChild(body13);
        body4.addChild(body5);
        frontButton1.addChild(frontButton3);
        body21.addChild(body22);
        body6.addChild(body7);
        body3.addChild(body4);
        body15.addChild(body17);
        frontButton1.addChild(frontButton2);
        body1.addChild(body2);
        body1.addChild(body29);
        guard1.addChild(guard2);
        body8.addChild(body9);
        body13.addChild(body14);
        body6.addChild(body8);
        body20.addChild(body21);
        body1.addChild(body6);
        body2.addChild(body3);
        body1.addChild(body19);
        body19.addChild(body20);
        body1.addChild(body15);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        guard1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(guard3.offsetX, guard3.offsetY, guard3.offsetZ);
        GL11.glTranslatef(guard3.rotationPointX * f5, guard3.rotationPointY * f5, guard3.rotationPointZ * f5);
        GL11.glScaled(1.04D, 1.0D, 1.0D);
        GL11.glTranslatef(-guard3.offsetX, -guard3.offsetY, -guard3.offsetZ);
        GL11.glTranslatef(-guard3.rotationPointX * f5, -guard3.rotationPointY * f5, -guard3.rotationPointZ * f5);
        guard3.render(f5);
        GL11.glPopMatrix();
        guard6.render(f5);
        body1.render(f5);
        guard5.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(frontButton1.offsetX, frontButton1.offsetY, frontButton1.offsetZ);
        GL11.glTranslatef(frontButton1.rotationPointX * f5, frontButton1.rotationPointY * f5, frontButton1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-frontButton1.offsetX, -frontButton1.offsetY, -frontButton1.offsetZ);
        GL11.glTranslatef(-frontButton1.rotationPointX * f5, -frontButton1.rotationPointY * f5, -frontButton1.rotationPointZ * f5);
        frontButton1.render(f5);
        GL11.glPopMatrix();
        panel2.render(f5);
        guard4.render(f5);
        panel1.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}