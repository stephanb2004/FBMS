package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.IgnitedChicaDisplayItem;

public class IgnitedChicaDisplayModel extends AnimatedGeoModel<IgnitedChicaDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/blocks/ichica.png");
	}
}
