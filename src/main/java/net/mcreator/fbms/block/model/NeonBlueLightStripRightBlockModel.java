package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonBlueLightStripRightTileEntity;

public class NeonBlueLightStripRightBlockModel extends AnimatedGeoModel<NeonBlueLightStripRightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonBlueLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonBlueLightStripRightTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonBlueLightStripRightTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonblueright.png");
	}
}
