package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DeluxeBallpitDisplayItem;

public class DeluxeBallpitDisplayModel extends AnimatedGeoModel<DeluxeBallpitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeBallpitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/deluxe_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeBallpitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/deluxe_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeBallpitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/deluxe_ballpit.png");
	}
}
