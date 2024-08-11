package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RetroChicaDisplayItem;

public class RetroChicaDisplayModel extends AnimatedGeoModel<RetroChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/retrochica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/retrochica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/retrochica.png");
	}
}
