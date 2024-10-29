package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CandyCadetTileEntity;

public class CandyCadetBlockModel extends AnimatedGeoModel<CandyCadetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/candycadetblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/candycadetblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCadetTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/candycadet2.png");
	}
}
