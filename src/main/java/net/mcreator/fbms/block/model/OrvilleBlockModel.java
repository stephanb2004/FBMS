package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OrvilleTileEntity;

public class OrvilleBlockModel extends GeoModel<OrvilleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/orvilleblockv2v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/orvilleblockv2v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/magicv2v2.png");
	}
}
