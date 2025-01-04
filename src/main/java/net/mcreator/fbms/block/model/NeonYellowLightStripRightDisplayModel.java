package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonYellowLightStripRightDisplayItem;

public class NeonYellowLightStripRightDisplayModel extends AnimatedGeoModel<NeonYellowLightStripRightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonYellowLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonYellowLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonYellowLightStripRightDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonyellowright.png");
	}
}
