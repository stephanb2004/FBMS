package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DiscountCoolingUnitDisplayItem;

public class DiscountCoolingUnitDisplayModel extends GeoModel<DiscountCoolingUnitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiscountCoolingUnitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/discountcoolingunit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountCoolingUnitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/discountcoolingunit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountCoolingUnitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/discountcooling.png");
	}
}
