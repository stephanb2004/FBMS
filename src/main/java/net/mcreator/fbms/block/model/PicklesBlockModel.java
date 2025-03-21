package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PicklesTileEntity;

public class PicklesBlockModel extends GeoModel<PicklesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PicklesTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pickles.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PicklesTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pickles.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PicklesTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/pickles.png");
	}
}
