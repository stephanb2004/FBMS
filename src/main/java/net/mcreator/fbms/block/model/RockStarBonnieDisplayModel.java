package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarBonnieDisplayItem;

public class RockStarBonnieDisplayModel extends GeoModel<RockStarBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarBonnieDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/rbonnie.png");
	}
}
