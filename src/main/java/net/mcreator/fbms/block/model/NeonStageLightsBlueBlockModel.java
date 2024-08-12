package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonStageLightsBlueTileEntity;

public class NeonStageLightsBlueBlockModel extends AnimatedGeoModel<NeonStageLightsBlueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightsBlueTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightsBlueTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightsBlueTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_stage_light_blue.png");
	}
}
