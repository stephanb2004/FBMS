package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NoveltyTrafficLightDisplayItem;

public class NoveltyTrafficLightDisplayModel extends GeoModel<NoveltyTrafficLightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NoveltyTrafficLightDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/stolen_traffic_light.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NoveltyTrafficLightDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/stolen_traffic_light.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NoveltyTrafficLightDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/itsafreetexture.png");
	}
}
