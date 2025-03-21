package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonStageLightsOrangeTileEntity;

public class NeonStageLightsOrangeBlockModel extends GeoModel<NeonStageLightsOrangeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightsOrangeTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightsOrangeTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightsOrangeTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_orange.png");
	}
}
