package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BrokenBarryPolarAnimatedDisplayItem;

public class BrokenBarryPolarAnimatedDisplayModel extends GeoModel<BrokenBarryPolarAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenBarryPolarAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/barrypolarbrokenanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenBarryPolarAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/barrypolarbrokenanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenBarryPolarAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/skinv2.png");
	}
}
