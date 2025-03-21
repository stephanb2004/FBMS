package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Coins1000TileEntity;

public class Coins1000BlockModel extends GeoModel<Coins1000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Coins1000TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/coins_1000.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins1000TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/coins_1000.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins1000TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/new.png");
	}
}
