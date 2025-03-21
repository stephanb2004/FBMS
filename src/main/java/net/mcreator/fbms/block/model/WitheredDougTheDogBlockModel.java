package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WitheredDougTheDogTileEntity;

public class WitheredDougTheDogBlockModel extends GeoModel<WitheredDougTheDogTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredDougTheDogTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wdoug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredDougTheDogTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wdoug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredDougTheDogTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/withered_doug.png");
	}
}
