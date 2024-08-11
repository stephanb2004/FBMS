package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BiteFredBearCutoutTileEntity;

public class BiteFredBearCutoutBlockModel extends AnimatedGeoModel<BiteFredBearCutoutTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BiteFredBearCutoutTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fredbearbiteblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BiteFredBearCutoutTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fredbearbiteblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BiteFredBearCutoutTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fredbear.png");
	}
}
