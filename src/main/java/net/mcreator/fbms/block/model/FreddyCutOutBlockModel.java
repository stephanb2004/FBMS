package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FreddyCutOutTileEntity;

public class FreddyCutOutBlockModel extends GeoModel<FreddyCutOutTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/freddycutout.png");
	}
}
