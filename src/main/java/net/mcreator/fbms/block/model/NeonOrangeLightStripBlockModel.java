package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonOrangeLightStripTileEntity;

public class NeonOrangeLightStripBlockModel extends GeoModel<NeonOrangeLightStripTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonOrangeLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonOrangeLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonOrangeLightStripTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonorangestripe.png");
	}
}
