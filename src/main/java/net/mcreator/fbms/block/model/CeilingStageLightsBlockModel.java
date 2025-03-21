package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CeilingStageLightsTileEntity;

public class CeilingStageLightsBlockModel extends GeoModel<CeilingStageLightsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightsTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_green.png");
	}
}
