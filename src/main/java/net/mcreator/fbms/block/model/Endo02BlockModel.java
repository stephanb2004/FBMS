package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Endo02TileEntity;

public class Endo02BlockModel extends AnimatedGeoModel<Endo02TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/endo02v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/endo02v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/endo02v2.png");
	}
}
