package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FtFreddyTileEntity;

public class FtFreddyBlockModel extends AnimatedGeoModel<FtFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FtFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FtFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FtFreddyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/ftfreddy.png");
	}
}
