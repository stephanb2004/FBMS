package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BarryPolarFixedDisplayItem;

public class BarryPolarFixedDisplayModel extends GeoModel<BarryPolarFixedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarFixedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/barrypolarfixedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarFixedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/barrypolarfixedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarFixedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fixedv2.png");
	}
}
