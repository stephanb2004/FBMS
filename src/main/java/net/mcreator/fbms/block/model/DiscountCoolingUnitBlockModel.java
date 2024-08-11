package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DiscountCoolingUnitTileEntity;

public class DiscountCoolingUnitBlockModel extends AnimatedGeoModel<DiscountCoolingUnitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiscountCoolingUnitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/discountcoolingunit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountCoolingUnitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/discountcoolingunit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountCoolingUnitTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/discountcooling.png");
	}
}
