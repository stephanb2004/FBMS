package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RustyAnimatedTileEntity;

public class RustyAnimatedBlockModel extends AnimatedGeoModel<RustyAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RustyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rustya.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RustyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rustya.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RustyAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/rusty.png");
	}
}
