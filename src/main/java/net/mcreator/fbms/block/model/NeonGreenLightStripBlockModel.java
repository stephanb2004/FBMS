package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonGreenLightStripTileEntity;

public class NeonGreenLightStripBlockModel extends AnimatedGeoModel<NeonGreenLightStripTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neongreenstripes.png");
	}
}
