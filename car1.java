package spongebobmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.client.Minecraft;

public class car1 extends EntityPig {
	public car1(World worldIn) {
		super(worldIn);
	}
	public Entity getControllingPassenger()
    {
        return this.getPassengers().isEmpty() ? null : (Entity)this.getPassengers().get(0);
    }
	 public boolean canBeSteered()
	    {
	        Entity entity = this.getControllingPassenger();

	        if (!(entity instanceof EntityPlayer)){
	            return true;
	        }
			return true;
	    	}
	 public boolean processInteract(EntityPlayer player, EnumHand p_184645_2_, ItemStack stack)
	    {
	        if (!super.processInteract(player, p_184645_2_, stack)){
	            return true;
	        	}
				return true;
	    }
@SideOnly(Side.CLIENT)
	public static void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(car1.class, new RenderLiving(Minecraft.getMinecraft().getRenderManager(), new model3(), 1){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("spongebobmod:car1");}});
}
}
