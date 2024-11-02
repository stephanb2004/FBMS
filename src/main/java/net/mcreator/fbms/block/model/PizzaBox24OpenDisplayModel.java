package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox24OpenDisplayItem;

public class PizzaBox24OpenDisplayModel extends AnimatedGeoModel<PizzaBox24OpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox24OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox24OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox24OpenDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox24.png");
	}
}