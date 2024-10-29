package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox24OpenTileEntity;

public class PizzaBox24OpenBlockModel extends AnimatedGeoModel<PizzaBox24OpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox24OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox24OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox24OpenTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox24.png");
	}
}
