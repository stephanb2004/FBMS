package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.JollyTheRatTileEntity;

public class JollyTheRatBlockModel extends GeoModel<JollyTheRatTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JollyTheRatTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/jolly_the_rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JollyTheRatTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/jolly_the_rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JollyTheRatTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/jolly_the_rat.png");
	}
}
