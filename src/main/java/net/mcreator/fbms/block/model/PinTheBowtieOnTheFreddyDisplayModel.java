package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PinTheBowtieOnTheFreddyDisplayItem;

public class PinTheBowtieOnTheFreddyDisplayModel extends GeoModel<PinTheBowtieOnTheFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieOnTheFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pin-the-bowtie-on-the-freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieOnTheFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pin-the-bowtie-on-the-freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieOnTheFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/pinthebowtietexture2.png");
	}
}
