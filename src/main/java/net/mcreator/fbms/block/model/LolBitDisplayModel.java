package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LolBitDisplayItem;

public class LolBitDisplayModel extends AnimatedGeoModel<LolBitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LolBitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/lolbitv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/lolbitv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/lolbitv2v2.png");
	}
}
