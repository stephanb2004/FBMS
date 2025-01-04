package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonYellowLightStripLeftTileEntity;

public class NeonYellowLightStripLeftBlockModel extends AnimatedGeoModel<NeonYellowLightStripLeftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonYellowLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonYellowLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonYellowLightStripLeftTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonyellowleft.png");
	}
}
