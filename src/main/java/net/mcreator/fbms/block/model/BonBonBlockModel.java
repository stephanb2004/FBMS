package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BonBonTileEntity;

public class BonBonBlockModel extends GeoModel<BonBonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonBonTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonBonTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonBonTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/bonbon.png");
	}
}
