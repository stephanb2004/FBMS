package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BrokenBarryPolarAnimatedTileEntity;

public class BrokenBarryPolarAnimatedBlockModel extends GeoModel<BrokenBarryPolarAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenBarryPolarAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/barrypolarbrokenanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenBarryPolarAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/barrypolarbrokenanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenBarryPolarAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/skinv2.png");
	}
}
