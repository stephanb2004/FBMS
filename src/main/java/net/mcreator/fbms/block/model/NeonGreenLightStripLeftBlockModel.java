package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonGreenLightStripLeftTileEntity;

public class NeonGreenLightStripLeftBlockModel extends AnimatedGeoModel<NeonGreenLightStripLeftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripLeftTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neongreenlightstipfix.png");
	}
}
