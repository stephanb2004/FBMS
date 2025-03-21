package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FuntimeChicaAnimatedTileEntity;

public class FuntimeChicaAnimatedBlockModel extends GeoModel<FuntimeChicaAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftchicaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftchicaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ftchica.png");
	}
}
