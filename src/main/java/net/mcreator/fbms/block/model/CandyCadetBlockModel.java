package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CandyCadetTileEntity;

public class CandyCadetBlockModel extends GeoModel<CandyCadetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/candycadetblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/candycadetblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/candycadet2.png");
	}
}
