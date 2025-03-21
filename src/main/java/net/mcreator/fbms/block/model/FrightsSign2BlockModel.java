package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FrightsSign2TileEntity;

public class FrightsSign2BlockModel extends GeoModel<FrightsSign2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrightsSign2TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/frights2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrightsSign2TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/frights2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrightsSign2TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/faz_bear_pizza_place.png");
	}
}
