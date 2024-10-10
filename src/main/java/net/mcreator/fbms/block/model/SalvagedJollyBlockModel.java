package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SalvagedJollyTileEntity;

public class SalvagedJollyBlockModel extends AnimatedGeoModel<SalvagedJollyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SalvagedJollyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/jolly_the_rat_salvaged.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SalvagedJollyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/jolly_the_rat_salvaged.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SalvagedJollyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/jolly_the_rat_salvaged.png");
	}
}
