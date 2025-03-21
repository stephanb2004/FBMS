package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ToyBonnieDisplayItem;

public class ToyBonnieDisplayModel extends GeoModel<ToyBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/toybonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/toybonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/tbonnie.png");
	}
}
