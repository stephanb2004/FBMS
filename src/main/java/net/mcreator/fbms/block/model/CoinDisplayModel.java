package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CoinDisplayItem;

public class CoinDisplayModel extends GeoModel<CoinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoinDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/coin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoinDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/coin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoinDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fazcoin.png");
	}
}
