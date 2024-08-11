package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LemonadeClownDisplayItem;

public class LemonadeClownDisplayModel extends AnimatedGeoModel<LemonadeClownDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LemonadeClownDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/lemonade_clown.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LemonadeClownDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/lemonade_clown.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LemonadeClownDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/lemonade_clown.png");
	}
}