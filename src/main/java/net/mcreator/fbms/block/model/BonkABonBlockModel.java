package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BonkABonTileEntity;

public class BonkABonBlockModel extends GeoModel<BonkABonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bonkabon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bonkabon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/bonkabon.png");
	}
}
