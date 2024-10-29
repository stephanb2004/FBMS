package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox85OpenDisplayItem;

public class PizzaBox85OpenDisplayModel extends AnimatedGeoModel<PizzaBox85OpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox85OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox85OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox85OpenDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox85.png");
	}
}
