package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RottenPitTileEntity;

public class RottenPitBlockModel extends AnimatedGeoModel<RottenPitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RottenPitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rotten_pit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RottenPitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rotten_pit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RottenPitTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/rotten_pit.png");
	}
}
