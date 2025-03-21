package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonRedLightStripRightTileEntity;

public class NeonRedLightStripRightBlockModel extends GeoModel<NeonRedLightStripRightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonredright.png");
	}
}
