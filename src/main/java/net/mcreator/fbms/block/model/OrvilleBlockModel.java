package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OrvilleTileEntity;

public class OrvilleBlockModel extends AnimatedGeoModel<OrvilleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/orvilleblockv2v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/orvilleblockv2v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/magicv2v2.png");
	}
}
