package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BalloonBoyTileEntity;

public class BalloonBoyBlockModel extends AnimatedGeoModel<BalloonBoyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBoyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBoyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBoyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/bb.png");
	}
}