package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OrvilleDisplayItem;

public class OrvilleDisplayModel extends AnimatedGeoModel<OrvilleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/orvillev2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/orvillev2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/magicv2.png");
	}
}