package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.StephanPlushDisplayItem;

public class StephanPlushDisplayModel extends AnimatedGeoModel<StephanPlushDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StephanPlushDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/stephanplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StephanPlushDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/stephanplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StephanPlushDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/stephanplush.png");
	}
}
