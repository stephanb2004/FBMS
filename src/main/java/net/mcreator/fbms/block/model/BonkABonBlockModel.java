package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BonkABonTileEntity;

public class BonkABonBlockModel extends AnimatedGeoModel<BonkABonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bonkabon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bonkabon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonkABonTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/bonkabon.png");
	}
}
