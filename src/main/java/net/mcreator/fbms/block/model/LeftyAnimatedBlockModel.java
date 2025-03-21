package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LeftyAnimatedTileEntity;

public class LeftyAnimatedBlockModel extends GeoModel<LeftyAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeftyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/leftyanimatedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/leftyanimatedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/leftyv2v2.png");
	}
}
