package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins100TileEntity;

public class Coins100BlockModel extends GeoModel<Coins100TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins100TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_100.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins100TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_100.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins100TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/new.png");
	}
}
