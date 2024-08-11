package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.EggBabyTileEntity;

public class EggBabyBlockModel extends AnimatedGeoModel<EggBabyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EggBabyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fmseggbaby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EggBabyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fmseggbaby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EggBabyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_egg_baby.png");
	}
}
