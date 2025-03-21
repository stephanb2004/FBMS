package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.StationWagonBlockTileEntity;

public class StationWagonBlockBlockModel extends GeoModel<StationWagonBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StationWagonBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/stationwagonblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StationWagonBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/stationwagonblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StationWagonBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/themanagersstationwagon.png");
	}
}
