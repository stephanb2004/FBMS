package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonStageLightsBlueTileEntity;

public class NeonStageLightsBlueBlockModel extends GeoModel<NeonStageLightsBlueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightsBlueTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightsBlueTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightsBlueTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_blue.png");
	}
}
