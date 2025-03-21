package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GravityVortex2TileEntity;

public class GravityVortex2BlockModel extends GeoModel<GravityVortex2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GravityVortex2TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/gravityvortex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravityVortex2TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/gravityvortex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravityVortex2TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/the_orb.png");
	}
}
