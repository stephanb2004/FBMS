package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PrizeCounterSignTileEntity;

public class PrizeCounterSignBlockModel extends GeoModel<PrizeCounterSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PrizeCounterSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrizeCounterSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrizeCounterSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/prizecounter.png");
	}
}
