package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LolBitTileEntity;

public class LolBitBlockModel extends AnimatedGeoModel<LolBitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolBitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/lolbitv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/lolbitv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBitTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/lolbitv2.png");
	}
}
