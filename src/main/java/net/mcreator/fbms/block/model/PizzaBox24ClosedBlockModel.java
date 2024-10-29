package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox24ClosedTileEntity;

public class PizzaBox24ClosedBlockModel extends AnimatedGeoModel<PizzaBox24ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox24ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox24ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox24ClosedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox24.png");
	}
}
