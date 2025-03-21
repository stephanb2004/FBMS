package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MusicManDisplayItem;

public class MusicManDisplayModel extends GeoModel<MusicManDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MusicManDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/music.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicManDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/music.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicManDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/musicman.png");
	}
}
