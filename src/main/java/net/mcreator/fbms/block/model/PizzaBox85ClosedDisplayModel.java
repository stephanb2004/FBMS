package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox85ClosedDisplayItem;

public class PizzaBox85ClosedDisplayModel extends GeoModel<PizzaBox85ClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox85ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox85ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox85ClosedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox85.png");
	}
}
