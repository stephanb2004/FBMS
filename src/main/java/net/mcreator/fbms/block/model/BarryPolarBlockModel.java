package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BarryPolarTileEntity;

public class BarryPolarBlockModel extends GeoModel<BarryPolarTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/barrypolarsitbrokenv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/barrypolarsitbrokenv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/skinv2.png");
	}
}
