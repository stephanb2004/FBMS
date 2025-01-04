package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonRedLightStripRightDisplayItem;

public class NeonRedLightStripRightDisplayModel extends AnimatedGeoModel<NeonRedLightStripRightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripRightDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonredright.png");
	}
}
