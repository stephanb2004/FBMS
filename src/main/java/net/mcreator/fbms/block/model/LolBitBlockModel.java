package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LolBitTileEntity;

public class LolBitBlockModel extends GeoModel<LolBitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolBitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/lolbitv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/lolbitv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBitTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/lolbitv2v2.png");
	}
}
