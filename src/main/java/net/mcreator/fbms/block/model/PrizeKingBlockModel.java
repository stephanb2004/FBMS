package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PrizeKingTileEntity;

public class PrizeKingBlockModel extends AnimatedGeoModel<PrizeKingTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PrizeKingTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/prizeking.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrizeKingTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/prizeking.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrizeKingTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/prizeking.png");
	}
}