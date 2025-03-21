package net.mcreator.fbms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.StationWagonEntity;

public class StationWagonModel extends GeoModel<StationWagonEntity> {
	@Override
	public ResourceLocation getAnimationResource(StationWagonEntity entity) {
		return new ResourceLocation("fbms", "animations/stationwagon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StationWagonEntity entity) {
		return new ResourceLocation("fbms", "geo/stationwagon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StationWagonEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
