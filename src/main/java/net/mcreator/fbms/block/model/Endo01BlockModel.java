package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Endo01TileEntity;

public class Endo01BlockModel extends GeoModel<Endo01TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/endo01.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/endo01.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/endo01.png");
	}
}
