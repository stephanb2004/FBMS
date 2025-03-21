package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Fredbear01AnimatedTileEntity;

public class Fredbear01AnimatedBlockModel extends GeoModel<Fredbear01AnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fredbear01AnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/01_fredbear_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fredbear01AnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/01_fredbear_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fredbear01AnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/01_fredbear.png");
	}
}
