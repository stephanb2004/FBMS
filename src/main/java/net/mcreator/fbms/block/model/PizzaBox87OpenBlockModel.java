package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaBox87OpenTileEntity;

public class PizzaBox87OpenBlockModel extends GeoModel<PizzaBox87OpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox87OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox87OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox87OpenTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox87.png");
	}
}
