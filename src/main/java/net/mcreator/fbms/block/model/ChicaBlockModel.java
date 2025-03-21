package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ChicaTileEntity;

public class ChicaBlockModel extends GeoModel<ChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/chica.png");
	}
}
