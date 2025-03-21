package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LolBitDtDisplayItem;

public class LolBitDtDisplayModel extends GeoModel<LolBitDtDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LolBitDtDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/lolbitv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBitDtDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/lolbitv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBitDtDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/lolbit_dtv2.png");
	}
}
