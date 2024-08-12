package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DeluxeBallpitTileEntity;

public class DeluxeBallpitBlockModel extends AnimatedGeoModel<DeluxeBallpitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeBallpitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/deluxe_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeBallpitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/deluxe_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeBallpitTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/deluxe_ballpit.png");
	}
}
