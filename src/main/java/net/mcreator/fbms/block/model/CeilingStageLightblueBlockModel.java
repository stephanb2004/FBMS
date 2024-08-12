package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CeilingStageLightblueTileEntity;

public class CeilingStageLightblueBlockModel extends AnimatedGeoModel<CeilingStageLightblueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightblueTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightblueTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightblueTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_stage_light_blue.png");
	}
}
