package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ToyPugTileEntity;

public class ToyPugBlockModel extends GeoModel<ToyPugTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyPugTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/toypug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyPugTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/toypug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyPugTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/toypug.png");
	}
}
