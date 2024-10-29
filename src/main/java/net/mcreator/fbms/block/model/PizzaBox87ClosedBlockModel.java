package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox87ClosedTileEntity;

public class PizzaBox87ClosedBlockModel extends AnimatedGeoModel<PizzaBox87ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox87ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox87ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox87ClosedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox87.png");
	}
}
