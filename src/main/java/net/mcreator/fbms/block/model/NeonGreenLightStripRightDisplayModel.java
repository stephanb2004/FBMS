package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonGreenLightStripRightDisplayItem;

public class NeonGreenLightStripRightDisplayModel extends AnimatedGeoModel<NeonGreenLightStripRightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripRightDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neongreenright.png");
	}
}
