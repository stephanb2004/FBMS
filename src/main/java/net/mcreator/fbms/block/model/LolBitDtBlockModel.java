package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LolBitDtTileEntity;

public class LolBitDtBlockModel extends AnimatedGeoModel<LolBitDtTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolBitDtTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/lolbitv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBitDtTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/lolbitv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBitDtTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/lolbitclothedv2.png");
	}
}
