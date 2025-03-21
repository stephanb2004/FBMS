package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LolBitDtTileEntity;

public class LolBitDtBlockModel extends GeoModel<LolBitDtTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolBitDtTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/lolbitv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBitDtTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/lolbitv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBitDtTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/lolbit_dtv2.png");
	}
}
