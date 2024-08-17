package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.GtEndoDisplayItem;

public class GtEndoDisplayModel extends AnimatedGeoModel<GtEndoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GtEndoDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/gtendo_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GtEndoDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/gtendo_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GtEndoDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/gt_endo.png");
	}
}