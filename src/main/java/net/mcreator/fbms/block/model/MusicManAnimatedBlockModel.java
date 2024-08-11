package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MusicManAnimatedTileEntity;

public class MusicManAnimatedBlockModel extends AnimatedGeoModel<MusicManAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MusicManAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/musicmana.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicManAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/musicmana.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicManAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/musicman.png");
	}
}