package spongebobmod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
//imports
@Mod(modid = "spongebobmod", name = "3D Projectiles", version = "1.0")
public class spongebobmod{
	   public static final String modid = "spongebobmod";
	   public static final String name = "Generic Mod";
	   public static final String version = "0.0.0";
	   
public static Item spatula;
public static ModelBase model2;

@Instance("spongebobmod")
public static spongebobmod instance = new spongebobmod();

@SidedProxy(clientSide = "spongebobmod.ClientProxy", serverSide = "spongebobmod.ServerProxy")
public static CommonProxy proxy;

@EventHandler
public void preInit(FMLPreInitializationEvent event){
   this.proxy.preInit(event);
   EntityRegistry.registerGlobalEntityID(entity1.class, "entity1", EntityRegistry.findGlobalUniqueEntityId());
	EntityRegistry.registerModEntity(entity1.class, "entity1", EntityRegistry.findGlobalUniqueEntityId(), spongebobmod.modid, 64, 1, true);
	EntityList.entityEggs.put("entity1", new EntityList.EntityEggInfo("entity1", (204 << 16) + (255 << 8) + 51, (102 << 16) + (153 << 8) + 0));
	EntityRegistry.addSpawn(entity1.class, 5, 2, 5, EnumCreatureType.CREATURE , entity1.wipe(BiomeGenBase.biomeRegistry));
}
@EventHandler
public void init(FMLInitializationEvent event){
   this.proxy.init(event);
}
@EventHandler
public void postInit(FMLPostInitializationEvent event){
   this.proxy.postInit(event);
  }
}
