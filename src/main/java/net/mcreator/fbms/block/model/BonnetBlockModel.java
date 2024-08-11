package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BonnetTileEntity;

public class BonnetBlockModel extends AnimatedGeoModel<BonnetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnetTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/bonnet.png");
	}
}
