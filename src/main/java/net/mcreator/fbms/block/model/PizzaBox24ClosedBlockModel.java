package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox24ClosedTileEntity;

public class PizzaBox24ClosedBlockModel extends GeoModel<PizzaBox24ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox24ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox24ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox24ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox24.png");
	}
}
