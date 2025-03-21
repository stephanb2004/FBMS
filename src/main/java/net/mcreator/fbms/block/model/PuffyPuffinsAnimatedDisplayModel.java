package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PuffyPuffinsAnimatedDisplayItem;

public class PuffyPuffinsAnimatedDisplayModel extends GeoModel<PuffyPuffinsAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuffyPuffinsAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/puffypuffins_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuffyPuffinsAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/puffypuffins_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuffyPuffinsAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/puffy_puffins.png");
	}
}
