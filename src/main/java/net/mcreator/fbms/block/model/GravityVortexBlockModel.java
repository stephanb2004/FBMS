package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GravityVortexTileEntity;

public class GravityVortexBlockModel extends AnimatedGeoModel<GravityVortexTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fmsgravityvortex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fmsgravityvortex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravityVortexTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/the_orb.png");
	}
}
