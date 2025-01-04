package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonYellowLightStripTileEntity;

public class NeonYellowLightStripBlockModel extends AnimatedGeoModel<NeonYellowLightStripTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonYellowLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonYellowLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonYellowLightStripTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonyellowstripe.png");
	}
}
