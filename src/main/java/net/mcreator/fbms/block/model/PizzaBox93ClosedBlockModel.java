package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox93ClosedTileEntity;

public class PizzaBox93ClosedBlockModel extends AnimatedGeoModel<PizzaBox93ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox93ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox93ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox93ClosedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox93.png");
	}
}
