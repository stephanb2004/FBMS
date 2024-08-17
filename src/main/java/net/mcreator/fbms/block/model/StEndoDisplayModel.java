package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.StEndoDisplayItem;

public class StEndoDisplayModel extends AnimatedGeoModel<StEndoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StEndoDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/st_endo_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StEndoDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/st_endo_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StEndoDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/st_endo.png");
	}
}
