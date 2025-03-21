package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BrokenChicaDisplayItem;

public class BrokenChicaDisplayModel extends GeoModel<BrokenChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/chicabroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/chicabroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/chicabroken.png");
	}
}
