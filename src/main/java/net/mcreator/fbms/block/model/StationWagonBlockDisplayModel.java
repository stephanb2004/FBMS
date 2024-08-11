package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.StationWagonBlockDisplayItem;

public class StationWagonBlockDisplayModel extends AnimatedGeoModel<StationWagonBlockDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/blocks/themanagersstationwagon.png");
	}
}
