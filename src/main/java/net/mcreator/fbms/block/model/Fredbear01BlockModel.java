package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Fredbear01TileEntity;

public class Fredbear01BlockModel extends GeoModel<Fredbear01TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fredbear01TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/01_fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fredbear01TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/01_fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fredbear01TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/01_fredbear.png");
	}
}
