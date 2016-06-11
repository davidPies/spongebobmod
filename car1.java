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
}
