package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CoinTileEntity;

public class CoinBlockModel extends AnimatedGeoModel<CoinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoinTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoinTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoinTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fazcoin.png");
	}
}
