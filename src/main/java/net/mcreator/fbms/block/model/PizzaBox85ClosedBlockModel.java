package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox85ClosedTileEntity;

public class PizzaBox85ClosedBlockModel extends AnimatedGeoModel<PizzaBox85ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox85ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox85ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox85ClosedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox85.png");
	}
}
