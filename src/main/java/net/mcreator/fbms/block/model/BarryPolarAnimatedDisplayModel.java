package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BarryPolarAnimatedDisplayItem;

public class BarryPolarAnimatedDisplayModel extends AnimatedGeoModel<BarryPolarAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/barrypolaranimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/barrypolaranimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fixedv2.png");
	}
}
