package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LargeSignDisplayItem;

public class LargeSignDisplayModel extends AnimatedGeoModel<LargeSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LargeSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/tattletail.png");
	}
}
