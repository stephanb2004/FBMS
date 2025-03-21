package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LargeSign2TileEntity;

public class LargeSign2BlockModel extends GeoModel<LargeSign2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeSign2TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSign2TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSign2TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/amgous.png");
	}
}
