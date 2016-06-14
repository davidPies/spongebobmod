package spongebobmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent e) { 
    //this.preInit(e);
    	
    }
    

    public void init(FMLInitializationEvent e) {
    	
	    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(spongebobmod.spatula, 0, new ModelResourceLocation(spongebobmod.modid + ":" + spongebobmod.spatula.getUnlocalizedName().substring(5), "inventory"));
	    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(spongebobmod.spatulagold, 0, new ModelResourceLocation(spongebobmod.modid + ":" + spongebobmod.spatulagold.getUnlocalizedName().substring(5), "inventory"));
	    	//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation(spongebobmod.modid + ":" + this.getUnlocalizedName().substring(5), "inventory"));
    //this.init(e);
    }

    public void postInit(FMLPostInitializationEvent e) {
    //this.postInit(e);
    }
    public void registerRenderers() {
    	entity1.registerRenderers(); 
	}
}
