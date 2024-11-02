package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox93ClosedDisplayItem;

public class PizzaBox93ClosedDisplayModel extends AnimatedGeoModel<PizzaBox93ClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox93ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox93ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox93ClosedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox93.png");
	}
}