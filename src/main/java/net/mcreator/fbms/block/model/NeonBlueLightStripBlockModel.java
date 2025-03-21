package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonBlueLightStripTileEntity;

public class NeonBlueLightStripBlockModel extends GeoModel<NeonBlueLightStripTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonBlueLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonBlueLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonBlueLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonbluestripe.png");
	}
}
