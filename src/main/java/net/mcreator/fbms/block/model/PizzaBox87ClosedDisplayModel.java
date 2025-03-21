package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox87ClosedDisplayItem;

public class PizzaBox87ClosedDisplayModel extends GeoModel<PizzaBox87ClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox87ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox87ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox87ClosedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox87.png");
	}
}
