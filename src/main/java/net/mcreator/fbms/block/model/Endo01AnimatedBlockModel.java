package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Endo01AnimatedTileEntity;

public class Endo01AnimatedBlockModel extends AnimatedGeoModel<Endo01AnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01AnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/endo01a.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01AnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/endo01a.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01AnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/endo01.png");
	}
}
