package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FtFreddyTileEntity;

public class FtFreddyBlockModel extends GeoModel<FtFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FtFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FtFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FtFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ftfreddy.png");
	}
}
