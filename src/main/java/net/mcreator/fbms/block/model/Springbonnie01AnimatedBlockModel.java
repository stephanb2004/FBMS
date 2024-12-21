package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Springbonnie01AnimatedTileEntity;

public class Springbonnie01AnimatedBlockModel extends AnimatedGeoModel<Springbonnie01AnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Springbonnie01AnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/01_springbonnie_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Springbonnie01AnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/01_springbonnie_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Springbonnie01AnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/01_springbonnie.png");
	}
}
