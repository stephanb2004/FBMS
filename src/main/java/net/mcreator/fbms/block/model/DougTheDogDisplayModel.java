package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DougTheDogDisplayItem;

public class DougTheDogDisplayModel extends GeoModel<DougTheDogDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DougTheDogDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dougthedog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougTheDogDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dougthedog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougTheDogDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/dougthedog.png");
	}
}
