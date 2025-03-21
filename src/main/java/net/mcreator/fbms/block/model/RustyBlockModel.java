package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RustyTileEntity;

public class RustyBlockModel extends GeoModel<RustyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RustyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rustyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RustyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rustyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RustyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rusty.png");
	}
}
