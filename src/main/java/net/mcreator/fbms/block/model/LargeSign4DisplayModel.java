package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LargeSign4DisplayItem;

public class LargeSign4DisplayModel extends GeoModel<LargeSign4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LargeSign4DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/sign4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSign4DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/sign4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSign4DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/nul7j1k.png");
	}
}
