package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LargeSign4TileEntity;

public class LargeSign4BlockModel extends GeoModel<LargeSign4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeSign4TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/sign4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSign4TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/sign4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSign4TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/nul7j1k.png");
	}
}
