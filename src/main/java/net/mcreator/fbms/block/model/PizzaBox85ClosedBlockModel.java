package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox85ClosedTileEntity;

public class PizzaBox85ClosedBlockModel extends GeoModel<PizzaBox85ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox85ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox85ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox85ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox85.png");
	}
}
