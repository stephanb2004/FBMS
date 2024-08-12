package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CeilingStageLightblueDisplayItem;

public class CeilingStageLightblueDisplayModel extends AnimatedGeoModel<CeilingStageLightblueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightblueDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightblueDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightblueDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_stage_light_blue.png");
	}
}
