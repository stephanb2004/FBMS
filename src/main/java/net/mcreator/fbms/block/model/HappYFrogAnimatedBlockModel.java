package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HappYFrogAnimatedTileEntity;

public class HappYFrogAnimatedBlockModel extends AnimatedGeoModel<HappYFrogAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HappYFrogAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/happyfroga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappYFrogAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/happyfroga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappYFrogAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/happyfrog.png");
	}
}
