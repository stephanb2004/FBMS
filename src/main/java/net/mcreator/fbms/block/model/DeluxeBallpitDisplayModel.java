package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DeluxeBallpitDisplayItem;

public class DeluxeBallpitDisplayModel extends GeoModel<DeluxeBallpitDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/block/deluxe_ballpit.png");
	}
}
