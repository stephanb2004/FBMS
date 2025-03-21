package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonStageLightsOrangeDisplayItem;

public class NeonStageLightsOrangeDisplayModel extends GeoModel<NeonStageLightsOrangeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightsOrangeDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightsOrangeDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightsOrangeDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_orange.png");
	}
}
