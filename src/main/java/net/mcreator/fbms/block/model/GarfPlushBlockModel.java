package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GarfPlushTileEntity;

public class GarfPlushBlockModel extends GeoModel<GarfPlushTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GarfPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/garfield_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GarfPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/garfield_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GarfPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/thefuckingcatthatihate.png");
	}
}
