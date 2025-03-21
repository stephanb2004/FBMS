package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DiscountBallpitDisplayItem;

public class DiscountBallpitDisplayModel extends GeoModel<DiscountBallpitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiscountBallpitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/discount_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountBallpitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/discount_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountBallpitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/discountballpitmoltenshouse.png");
	}
}
