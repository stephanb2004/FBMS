package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ToyFoxyDisplayItem;

public class ToyFoxyDisplayModel extends GeoModel<ToyFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/toyfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/toyfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/tfoxyv2.png");
	}
}
