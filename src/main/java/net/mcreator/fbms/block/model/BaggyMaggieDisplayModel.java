package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BaggyMaggieDisplayItem;

public class BaggyMaggieDisplayModel extends GeoModel<BaggyMaggieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BaggyMaggieDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/baggymaggie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaggyMaggieDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/baggymaggie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaggyMaggieDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/baggymaggie.png");
	}
}
