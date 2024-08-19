package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins25TileEntity;

public class Coins25BlockModel extends AnimatedGeoModel<Coins25TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins25TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_25.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins25TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_25.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins25TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/new.png");
	}
}
