package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FuntimeChicaAnimatedTileEntity;

public class FuntimeChicaAnimatedBlockModel extends AnimatedGeoModel<FuntimeChicaAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftchicaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftchicaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeChicaAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/ftchica.png");
	}
}
