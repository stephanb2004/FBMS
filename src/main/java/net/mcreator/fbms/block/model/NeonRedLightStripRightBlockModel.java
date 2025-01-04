package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonRedLightStripRightTileEntity;

public class NeonRedLightStripRightBlockModel extends AnimatedGeoModel<NeonRedLightStripRightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripRightTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonredright.png");
	}
}
