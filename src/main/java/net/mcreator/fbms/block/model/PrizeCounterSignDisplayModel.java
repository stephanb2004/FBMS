package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PrizeCounterSignDisplayItem;

public class PrizeCounterSignDisplayModel extends AnimatedGeoModel<PrizeCounterSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PrizeCounterSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrizeCounterSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrizeCounterSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/prizecounter.png");
	}
}
