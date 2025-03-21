package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonStageLightsBlueDisplayItem;

public class NeonStageLightsBlueDisplayModel extends GeoModel<NeonStageLightsBlueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightsBlueDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightsBlueDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightsBlueDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_blue.png");
	}
}
