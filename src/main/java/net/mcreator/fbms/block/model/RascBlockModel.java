package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RascTileEntity;

public class RascBlockModel extends GeoModel<RascTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RascTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rasc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RascTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rasc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RascTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rasc.png");
	}
}
