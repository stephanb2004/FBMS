package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonRedLightStripLeftTileEntity;

public class NeonRedLightStripLeftBlockModel extends GeoModel<NeonRedLightStripLeftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonlightleft5.png");
	}
}
