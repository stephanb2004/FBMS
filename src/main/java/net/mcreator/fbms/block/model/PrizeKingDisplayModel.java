package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PrizeKingDisplayItem;

public class PrizeKingDisplayModel extends GeoModel<PrizeKingDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PrizeKingDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/prizeking.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrizeKingDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/prizeking.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrizeKingDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/prizeking.png");
	}
}
