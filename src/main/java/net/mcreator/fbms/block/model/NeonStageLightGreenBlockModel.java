package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonStageLightGreenTileEntity;

public class NeonStageLightGreenBlockModel extends GeoModel<NeonStageLightGreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightGreenTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightGreenTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightGreenTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_green.png");
	}
}
