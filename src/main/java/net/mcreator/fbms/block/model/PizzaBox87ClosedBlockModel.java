package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox87ClosedTileEntity;

public class PizzaBox87ClosedBlockModel extends GeoModel<PizzaBox87ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox87ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox87ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox87ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox87.png");
	}
}
