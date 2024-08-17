
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fbms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.FbmsMod;

public class FbmsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FbmsMod.MODID);
	public static final RegistryObject<SoundEvent> HEHEHEHHEHEHEHHE = REGISTRY.register("hehehehhehehehhe", () -> new SoundEvent(new ResourceLocation("fbms", "hehehehhehehehhe")));
	public static final RegistryObject<SoundEvent> CATPLUSH = REGISTRY.register("catplush", () -> new SoundEvent(new ResourceLocation("fbms", "catplush")));
	public static final RegistryObject<SoundEvent> CHANNELCHANGE = REGISTRY.register("channelchange", () -> new SoundEvent(new ResourceLocation("fbms", "channelchange")));
	public static final RegistryObject<SoundEvent> BYEBYE = REGISTRY.register("byebye", () -> new SoundEvent(new ResourceLocation("fbms", "byebye")));
	public static final RegistryObject<SoundEvent> ROBOTON = REGISTRY.register("roboton", () -> new SoundEvent(new ResourceLocation("fbms", "roboton")));
	public static final RegistryObject<SoundEvent> TINK = REGISTRY.register("tink", () -> new SoundEvent(new ResourceLocation("fbms", "tink")));
}
