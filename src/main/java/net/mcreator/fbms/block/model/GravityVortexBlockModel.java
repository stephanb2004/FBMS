package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GravityVortexTileEntity;

public class GravityVortexBlockModel extends GeoModel<GravityVortexTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fmsgravityvortex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fmsgravityvortex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/the_orb.png");
	}
}
