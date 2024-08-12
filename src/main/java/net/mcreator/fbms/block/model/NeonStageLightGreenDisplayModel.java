package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonStageLightGreenDisplayItem;

public class NeonStageLightGreenDisplayModel extends AnimatedGeoModel<NeonStageLightGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightGreenDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightGreenDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightGreenDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_stage_light_green.png");
	}
}