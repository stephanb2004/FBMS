package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SalvagedJollyTileEntity;

public class SalvagedJollyBlockModel extends GeoModel<SalvagedJollyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SalvagedJollyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/jolly_the_rat_salvaged.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SalvagedJollyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/jolly_the_rat_salvaged.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SalvagedJollyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/jolly_the_rat_salvaged.png");
	}
}
