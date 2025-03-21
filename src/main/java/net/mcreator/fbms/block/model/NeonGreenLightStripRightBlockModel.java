package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonGreenLightStripRightTileEntity;

public class NeonGreenLightStripRightBlockModel extends GeoModel<NeonGreenLightStripRightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neongreenright.png");
	}
}
