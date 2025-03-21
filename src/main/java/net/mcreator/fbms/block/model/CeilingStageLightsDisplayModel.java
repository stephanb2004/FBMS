package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CeilingStageLightsDisplayItem;

public class CeilingStageLightsDisplayModel extends GeoModel<CeilingStageLightsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightsDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightsDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightsDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_green.png");
	}
}
