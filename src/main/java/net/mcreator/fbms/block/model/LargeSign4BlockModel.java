package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LargeSign4TileEntity;

public class LargeSign4BlockModel extends AnimatedGeoModel<LargeSign4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeSign4TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/sign4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSign4TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/sign4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSign4TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/nul7j1k.png");
	}
}
