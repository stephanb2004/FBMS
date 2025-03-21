package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonGreenLightStripTileEntity;

public class NeonGreenLightStripBlockModel extends GeoModel<NeonGreenLightStripTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neongreenstripes.png");
	}
}
