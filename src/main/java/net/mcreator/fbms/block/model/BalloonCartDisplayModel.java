package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BalloonCartDisplayItem;

public class BalloonCartDisplayModel extends GeoModel<BalloonCartDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BalloonCartDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/balloon_cart.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonCartDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/balloon_cart.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonCartDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/cart.png");
	}
}
