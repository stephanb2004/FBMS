package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.StationWagonBlockDisplayItem;

public class StationWagonBlockDisplayModel extends GeoModel<StationWagonBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StationWagonBlockDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/stationwagonblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StationWagonBlockDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/stationwagonblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StationWagonBlockDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/themanagersstationwagon.png");
	}
}
