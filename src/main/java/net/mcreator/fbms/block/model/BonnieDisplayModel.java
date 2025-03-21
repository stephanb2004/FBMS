package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BonnieDisplayItem;

public class BonnieDisplayModel extends GeoModel<BonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/bonnie.png");
	}
}
