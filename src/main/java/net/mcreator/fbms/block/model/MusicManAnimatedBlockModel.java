package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MusicManAnimatedTileEntity;

public class MusicManAnimatedBlockModel extends GeoModel<MusicManAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MusicManAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/musicmana.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicManAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/musicmana.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicManAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/musicman.png");
	}
}
