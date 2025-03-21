package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins10000TileEntity;

public class Coins10000BlockModel extends GeoModel<Coins10000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins10000TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_10000.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins10000TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_10000.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins10000TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/coinbag.png");
	}
}
