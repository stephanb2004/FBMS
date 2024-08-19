package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins10000TileEntity;

public class Coins10000BlockModel extends AnimatedGeoModel<Coins10000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins10000TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_10000.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins10000TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_10000.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins10000TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/coinbag.png");
	}
}
