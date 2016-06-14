package spongebobmod;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class entity1 extends EntityAnimal{

public entity1(World p_i1681_1_) {
		super(p_i1681_1_);

		setNoAI(!false);
		this.tasks.addTask(1, new EntityAIWander(this, 0.8D));
	}

@Override
protected Item getDropItem()
{
	return new ItemStack(Blocks.sponge).getItem();
}

@Override
protected SoundEvent getAmbientSound()
{
    return (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.soundEventRegistry.getObject(new ResourceLocation("spongebobmod:laugh"));
}

@Override
protected SoundEvent getHurtSound()
{
    return (SoundEvent)net.minecraft.util.SoundEvent.soundEventRegistry.getObject(new ResourceLocation("spongebob:laugh"));
}

@Override
protected SoundEvent getDeathSound()
{
	return (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.soundEventRegistry.getObject(new ResourceLocation("spongebobmod:laugh"));
}
@Override
protected float getSoundVolume(){
return 1.0F;
}
@Override
public EntityAgeable createChild(EntityAgeable arg0) {
	return null;
	}

//EntityRegistry.registerGlobalEntityID(entity1.class, "entity1", EntityRegistry.findGlobalUniqueEntityId());
//EntityRegistry.registerModEntity(entity1.class, "entity1", EntityRegistry.findGlobalUniqueEntityId(), this, 64, 1, true);
//EntityList.entityEggs.put("entity1", new EntityList.EntityEggInfo("entity1", (204 << 16) + (255 << 8) + 51, (102 << 16) + (153 << 8) + 0));
//EntityRegistry.addSpawn(entity1.class, 5, 2, 5, EnumCreatureType.CREATURE , wipe(BiomeGenBase.biomeRegistry));

public static BiomeGenBase[] wipe(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, BiomeGenBase> in) {
	Iterator<BiomeGenBase> itr = in.iterator();
	ArrayList<BiomeGenBase> ls = new ArrayList<BiomeGenBase>();
	while(itr.hasNext()){
		ls.add(itr.next());
	}
	return ls.toArray(new BiomeGenBase[ls.size()]);
	}
@SideOnly(Side.CLIENT)
public static void registerRenderers(){
	RenderingRegistry.registerEntityRenderingHandler(entity1.class, new RenderLiving(Minecraft.getMinecraft().getRenderManager(), new model2(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("spongebobmod:model2");}});
}}