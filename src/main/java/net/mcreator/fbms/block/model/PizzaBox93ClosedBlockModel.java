package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox93ClosedTileEntity;

public class PizzaBox93ClosedBlockModel extends GeoModel<PizzaBox93ClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox93ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox93ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox93ClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox93.png");
	}
}
