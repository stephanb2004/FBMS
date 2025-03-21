package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MusicManAnimatedDisplayItem;

public class MusicManAnimatedDisplayModel extends GeoModel<MusicManAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MusicManAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/musicmana.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicManAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/musicmana.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicManAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/musicman.png");
	}
}
