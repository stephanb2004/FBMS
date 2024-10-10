package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Megaultimatespeakertron3000DisplayItem;

public class Megaultimatespeakertron3000DisplayModel extends AnimatedGeoModel<Megaultimatespeakertron3000DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Megaultimatespeakertron3000DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/stage_speaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Megaultimatespeakertron3000DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/stage_speaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Megaultimatespeakertron3000DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/stage_speaker.png");
	}
}
