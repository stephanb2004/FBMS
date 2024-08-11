package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FruitPunchClownDisplayItem;

public class FruitPunchClownDisplayModel extends AnimatedGeoModel<FruitPunchClownDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FruitPunchClownDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fruint_punch_clown.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FruitPunchClownDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fruint_punch_clown.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FruitPunchClownDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fruit_punch_clown.png");
	}
}
