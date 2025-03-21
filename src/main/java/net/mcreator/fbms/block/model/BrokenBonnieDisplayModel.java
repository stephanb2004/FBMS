package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BrokenBonnieDisplayItem;

public class BrokenBonnieDisplayModel extends GeoModel<BrokenBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/bonniebroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/bonniebroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenBonnieDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/bonniebroken.png");
	}
}
