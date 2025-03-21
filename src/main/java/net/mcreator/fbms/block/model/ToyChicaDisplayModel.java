package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ToyChicaDisplayItem;

public class ToyChicaDisplayModel extends GeoModel<ToyChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/toychica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/toychica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/toychica.png");
	}
}
