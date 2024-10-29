package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox85OpenTileEntity;

public class PizzaBox85OpenBlockModel extends AnimatedGeoModel<PizzaBox85OpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox85OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox85OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox85OpenTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox85.png");
	}
}
