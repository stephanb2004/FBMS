package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DougTheDogTileEntity;

public class DougTheDogBlockModel extends GeoModel<DougTheDogTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DougTheDogTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dougthedog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougTheDogTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dougthedog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougTheDogTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/dougthedog.png");
	}
}
