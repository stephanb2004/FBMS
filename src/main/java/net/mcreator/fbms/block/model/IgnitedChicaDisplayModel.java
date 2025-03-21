package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.IgnitedChicaDisplayItem;

public class IgnitedChicaDisplayModel extends GeoModel<IgnitedChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IgnitedChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ichica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IgnitedChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ichica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IgnitedChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/ichica.png");
	}
}
