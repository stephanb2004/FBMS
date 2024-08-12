package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonStageLightsPinkTileEntity;

public class NeonStageLightsPinkBlockModel extends AnimatedGeoModel<NeonStageLightsPinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightsPinkTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightsPinkTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightsPinkTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_stage_light_pink.png");
	}
}
