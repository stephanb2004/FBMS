package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonYellowLightStripRightTileEntity;

public class NeonYellowLightStripRightBlockModel extends AnimatedGeoModel<NeonYellowLightStripRightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonYellowLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonYellowLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonYellowLightStripRightTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonyellowright.png");
	}
}
