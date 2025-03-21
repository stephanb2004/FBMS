package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DiscountCoolingUnitTileEntity;

public class DiscountCoolingUnitBlockModel extends GeoModel<DiscountCoolingUnitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiscountCoolingUnitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/discountcoolingunit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountCoolingUnitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/discountcoolingunit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountCoolingUnitTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/discountcooling.png");
	}
}
