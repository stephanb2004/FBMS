package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LolBit409DisplayItem;

public class LolBit409DisplayModel extends GeoModel<LolBit409DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LolBit409DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/oldlolbit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBit409DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/oldlolbit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBit409DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/lolbitold.png");
	}
}
