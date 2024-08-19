package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins100TileEntity;

public class Coins100BlockModel extends AnimatedGeoModel<Coins100TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins100TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_100.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins100TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_100.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins100TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/new.png");
	}
}
