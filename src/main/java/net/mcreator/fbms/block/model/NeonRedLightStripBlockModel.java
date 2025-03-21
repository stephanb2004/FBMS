package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonRedLightStripTileEntity;

public class NeonRedLightStripBlockModel extends GeoModel<NeonRedLightStripTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonredstripe.png");
	}
}
