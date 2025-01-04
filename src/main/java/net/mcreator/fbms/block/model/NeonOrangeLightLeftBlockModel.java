package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonOrangeLightLeftTileEntity;

public class NeonOrangeLightLeftBlockModel extends AnimatedGeoModel<NeonOrangeLightLeftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonOrangeLightLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonOrangeLightLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonOrangeLightLeftTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonorangeleft.png");
	}
}
