package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BuffetEndoTileEntity;

public class BuffetEndoBlockModel extends AnimatedGeoModel<BuffetEndoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BuffetEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/polar_endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BuffetEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/polar_endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BuffetEndoTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/polars_endo.png");
	}
}
