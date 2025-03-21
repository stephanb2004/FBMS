package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonGreenLightStripLeftTileEntity;

public class NeonGreenLightStripLeftBlockModel extends GeoModel<NeonGreenLightStripLeftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripLeftTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neongreenlightstipfix.png");
	}
}
