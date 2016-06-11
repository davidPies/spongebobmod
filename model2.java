package spongebobmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class model2 extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public model2()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-7F, -18F, -2F, 14, 18, 5);
      head.setRotationPoint(0F, 9F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 23);
      body.addBox(-7F, 0F, -2F, 14, 6, 5);
      body.setRotationPoint(0F, 9F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 38, 0);
      rightarm.addBox(-1F, -1F, -0.5F, 1, 15, 1);
      rightarm.setRotationPoint(-7F, 2F, 0.5F);
      rightarm.setTextureSize(64, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 42, 0);
      leftarm.addBox(0F, -1F, -0.5F, 1, 15, 1);
      leftarm.setRotationPoint(7F, 2F, 0.5F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 38, 16);
      rightleg.addBox(-0.5F, 0F, -1F, 1, 8, 1);
      rightleg.setRotationPoint(-3F, 15F, 0.5F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0.0174533F, 0F, 0F);
      leftleg = new ModelRenderer(this, 42, 16);
      leftleg.addBox(-0.5F, 0F, -1F, 1, 8, 1);
      leftleg.setRotationPoint(3F, 15F, 0.5F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 38, 25);
      Shape1.addBox(0F, 0F, 0F, 2, 1, 2);
      Shape1.setRotationPoint(-4F, 15F, -1F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 46, 25);
      Shape2.addBox(0F, 0F, 0F, 2, 1, 2);
      Shape2.setRotationPoint(2F, 15F, -1F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 38, 31);
      Shape3.addBox(-0.5F, 0F, -1.75F, 1, 1, 2);
      Shape3.setRotationPoint(-3F, 23F, 0.5F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 48, 31);
      Shape4.addBox(-0.5F, 0F, -1.75F, 1, 1, 2);
      Shape4.setRotationPoint(3F, 23F, 0.5F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 47, 0);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape5.setRotationPoint(-0.5F, -2F, -4F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 46, 34);
      Shape6.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape6.setRotationPoint(6.25F, 0.5F, -0.5F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 38, 34);
      Shape7.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape7.setRotationPoint(-8.3F, 0.5F, -0.5F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
  }

}
