package spongebobmod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class sounds {
	public static SoundEvent laugh;
	
	public static void registerSounds() {
		laugh = registerSound("laugh");
	}
	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(spongebobmod.modid, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}