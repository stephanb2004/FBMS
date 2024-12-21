package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Springbonnie01TileEntity;

public class Springbonnie01BlockModel extends AnimatedGeoModel<Springbonnie01TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Springbonnie01TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/01_springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Springbonnie01TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/01_springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Springbonnie01TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/01_springbonnie.png");
	}
}
