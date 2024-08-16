package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PizzaPlaceSignOldTileEntity;

public class PizzaPlaceSignOldBlockModel extends AnimatedGeoModel<PizzaPlaceSignOldTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaPlaceSignOldTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaPlaceSignOldTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaPlaceSignOldTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fnafsbsign.png");
	}
}
