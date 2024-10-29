package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox93OpenTileEntity;

public class PizzaBox93OpenBlockModel extends AnimatedGeoModel<PizzaBox93OpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox93OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox93OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox93OpenTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox93.png");
	}
}
