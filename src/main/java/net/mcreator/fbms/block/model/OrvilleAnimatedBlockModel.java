package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OrvilleAnimatedTileEntity;

public class OrvilleAnimatedBlockModel extends GeoModel<OrvilleAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/orvilleblockanimatedv2v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/orvilleblockanimatedv2v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/magicv2v2.png");
	}
}
