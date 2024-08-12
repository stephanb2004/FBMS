package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonStageLightsPinkDisplayItem;

public class NeonStageLightsPinkDisplayModel extends AnimatedGeoModel<NeonStageLightsPinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightsPinkDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightsPinkDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightsPinkDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_stage_light_pink.png");
	}
}
