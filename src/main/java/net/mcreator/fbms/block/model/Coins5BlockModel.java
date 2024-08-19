package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins5TileEntity;

public class Coins5BlockModel extends AnimatedGeoModel<Coins5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins5TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins5TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins5TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/new.png");
	}
}
