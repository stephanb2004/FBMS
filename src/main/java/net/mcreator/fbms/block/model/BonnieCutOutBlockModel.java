package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BonnieCutOutTileEntity;

public class BonnieCutOutBlockModel extends GeoModel<BonnieCutOutTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/bonniecutout.png");
	}
}
