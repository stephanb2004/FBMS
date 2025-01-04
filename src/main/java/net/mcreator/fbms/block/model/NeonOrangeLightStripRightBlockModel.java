package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonOrangeLightStripRightTileEntity;

public class NeonOrangeLightStripRightBlockModel extends AnimatedGeoModel<NeonOrangeLightStripRightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonOrangeLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonOrangeLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonOrangeLightStripRightTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonorangeright.png");
	}
}
