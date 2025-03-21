package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarChicaAnimatedDisplayItem;

public class RockStarChicaAnimatedDisplayModel extends GeoModel<RockStarChicaAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarChicaAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rchicaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarChicaAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rchicaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarChicaAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/rockstar_chica.png");
	}
}
