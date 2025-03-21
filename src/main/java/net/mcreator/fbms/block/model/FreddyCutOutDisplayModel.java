package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FreddyCutOutDisplayItem;

public class FreddyCutOutDisplayModel extends GeoModel<FreddyCutOutDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyCutOutDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/freddycutout.png");
	}
}
