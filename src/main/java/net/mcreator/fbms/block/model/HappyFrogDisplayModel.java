package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.HappyFrogDisplayItem;

public class HappyFrogDisplayModel extends AnimatedGeoModel<HappyFrogDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HappyFrogDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/happyfrogblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappyFrogDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/happyfrogblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappyFrogDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/happyfrog.png");
	}
}
