package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PinTheBowtieOnTheTieTheToyFreddyDisplayItem;

public class PinTheBowtieOnTheTieTheToyFreddyDisplayModel extends GeoModel<PinTheBowtieOnTheTieTheToyFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieOnTheTieTheToyFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pin-the-bowtie-on-the-freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieOnTheTieTheToyFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pin-the-bowtie-on-the-freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieOnTheTieTheToyFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/pinthebowtietexture.png");
	}
}
