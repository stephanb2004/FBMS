package net.mcreator.fbms.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.item.AnimatedBlocksItem;

public class AnimatedBlocksItemModel extends AnimatedGeoModel<AnimatedBlocksItem> {
	@Override
	public ResourceLocation getAnimationResource(AnimatedBlocksItem animatable) {
		return new ResourceLocation("fbms", "animations/elchip.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AnimatedBlocksItem animatable) {
		return new ResourceLocation("fbms", "geo/elchip.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AnimatedBlocksItem animatable) {
		return new ResourceLocation("fbms", "textures/items/elchip.png");
	}
}
