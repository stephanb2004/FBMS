package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins25TileEntity;

public class Coins25BlockModel extends GeoModel<Coins25TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins25TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_25.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins25TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_25.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins25TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/new.png");
	}
}
