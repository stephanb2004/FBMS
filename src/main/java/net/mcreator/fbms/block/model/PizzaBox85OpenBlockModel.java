package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox85OpenTileEntity;

public class PizzaBox85OpenBlockModel extends GeoModel<PizzaBox85OpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox85OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox85OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox85OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox85.png");
	}
}
