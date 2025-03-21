package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaPlaceSignTileEntity;

public class PizzaPlaceSignBlockModel extends GeoModel<PizzaPlaceSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaPlaceSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaPlaceSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaPlaceSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fnaf6sign.png");
	}
}
