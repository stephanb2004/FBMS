package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BallPitTowerTileEntity;

public class BallPitTowerBlockModel extends GeoModel<BallPitTowerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BallPitTowerTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ballpittower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallPitTowerTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ballpittower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallPitTowerTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ballpittower.png");
	}
}
