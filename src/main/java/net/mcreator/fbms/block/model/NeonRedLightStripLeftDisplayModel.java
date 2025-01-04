package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonRedLightStripLeftDisplayItem;

public class NeonRedLightStripLeftDisplayModel extends AnimatedGeoModel<NeonRedLightStripLeftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripLeftDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonlightleft5.png");
	}
}
