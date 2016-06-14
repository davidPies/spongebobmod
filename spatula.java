package spongebobmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class spatula extends ItemSword{
	 private final float attackDamage;
	    private final Item.ToolMaterial material;
	    public static ToolMaterial material1 = EnumHelper.addToolMaterial("material1", 1, 256, 4F, 5F, 12);
	    public spatula(Item.ToolMaterial material)
	    {
	    	super(material);
	        this.material = material;
	        GameRegistry.registerItem(this, "spatula");
	        this.maxStackSize = 1;
	        this.setMaxDamage(material.getMaxUses());
	        this.setCreativeTab(CreativeTabs.tabCombat);
	        this.attackDamage = 1.0F + material.getDamageVsEntity();
	    }
	    public float getDamageVsEntity()
	    {
	    	return this.material1.getDamageVsEntity();
	    }

	    public float getStrVsBlock(ItemStack stack, IBlockState state)
	    {
	        Block block = state.getBlock();

	        if (block == state)
	        { 
	            return 15.0F;
	        }
	        else
	        {
	            Material material = state.getMaterial();
	            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
	        }
	    }

	    /**
	     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
	     * the damage on the stack.
	     */
	    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	    {
	        stack.damageItem(1, attacker);
	        return true;
	    }

	    /**
	     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
	     */
	    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState blockIn, BlockPos pos, EntityLivingBase entityLiving)
	    {
	        if ((double)blockIn.getBlockHardness(worldIn, pos) != 0.0D)
	        {
	            stack.damageItem(2, entityLiving);
	        }

	        return true;
	    }

	    /**
	     * Check whether this Item can harvest the given Block
	     */
	    public boolean canHarvestBlock(IBlockState blockIn)
	    {
	        return blockIn.getBlock() == blockIn;
	    }

	    /**
	     * Returns True is the item is renderer in full 3D when hold.
	     */
	    @SideOnly(Side.CLIENT)
	    public boolean isFull3D()
	    {
	        return true;
	    }

	    /**
	     * Return the enchantability factor of the item, most of the time is based on material.
	     */
	    public int getItemEnchantability()
	    {
	        return this.material1.getEnchantability();
	    }

	    /**
	     * Return the name for this tool's material.
	     */
	    public String getToolMaterialName()
	    {
	        return this.material1.toString();
	    }

	    /**
	     * Return whether this item is repairable in an anvil.
	     */
	    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	    {
	        ItemStack mat = this.material1.getRepairItemStack();
	        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
	        return super.getIsRepairable(toRepair, repair);
	    }
}
