package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DiscountBallpitTileEntity;

public class DiscountBallpitBlockModel extends GeoModel<DiscountBallpitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiscountBallpitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/discount_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountBallpitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/discount_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountBallpitTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/discountballpitmoltenshouse.png");
	}
}
