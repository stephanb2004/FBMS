package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LargeSignTileEntity;

public class LargeSignBlockModel extends AnimatedGeoModel<LargeSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSignTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/tattletail.png");
	}
}
