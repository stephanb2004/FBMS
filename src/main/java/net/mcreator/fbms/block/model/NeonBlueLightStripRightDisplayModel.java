package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonBlueLightStripRightDisplayItem;

public class NeonBlueLightStripRightDisplayModel extends AnimatedGeoModel<NeonBlueLightStripRightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonBlueLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonBlueLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonBlueLightStripRightDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonblueright.png");
	}
}
