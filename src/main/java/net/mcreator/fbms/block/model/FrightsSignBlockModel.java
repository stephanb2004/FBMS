package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FrightsSignTileEntity;

public class FrightsSignBlockModel extends AnimatedGeoModel<FrightsSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrightsSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/frights2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrightsSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/frights2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrightsSignTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/frights.png");
	}
}
