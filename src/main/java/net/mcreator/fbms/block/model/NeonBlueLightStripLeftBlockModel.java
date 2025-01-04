package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonBlueLightStripLeftTileEntity;

public class NeonBlueLightStripLeftBlockModel extends AnimatedGeoModel<NeonBlueLightStripLeftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonBlueLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonBlueLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonBlueLightStripLeftTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonlightleft2.png");
	}
}
