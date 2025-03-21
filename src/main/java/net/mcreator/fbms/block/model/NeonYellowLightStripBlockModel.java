package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonYellowLightStripTileEntity;

public class NeonYellowLightStripBlockModel extends GeoModel<NeonYellowLightStripTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonYellowLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonYellowLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonYellowLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonyellowstripe.png");
	}
}
