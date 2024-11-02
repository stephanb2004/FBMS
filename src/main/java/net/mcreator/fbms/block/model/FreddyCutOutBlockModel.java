package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FreddyCutOutTileEntity;

public class FreddyCutOutBlockModel extends AnimatedGeoModel<FreddyCutOutTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyCutOutTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/freddycutout.png");
	}
}
