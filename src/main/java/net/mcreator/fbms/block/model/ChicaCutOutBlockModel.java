package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ChicaCutOutTileEntity;

public class ChicaCutOutBlockModel extends GeoModel<ChicaCutOutTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/chicacutout.png");
	}
}
