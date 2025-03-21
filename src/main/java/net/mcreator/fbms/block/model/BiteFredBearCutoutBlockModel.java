package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BiteFredBearCutoutTileEntity;

public class BiteFredBearCutoutBlockModel extends GeoModel<BiteFredBearCutoutTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BiteFredBearCutoutTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fredbearbiteblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BiteFredBearCutoutTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fredbearbiteblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BiteFredBearCutoutTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fredbear.png");
	}
}
