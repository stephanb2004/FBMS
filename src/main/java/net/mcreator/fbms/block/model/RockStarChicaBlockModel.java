package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarChicaTileEntity;

public class RockStarChicaBlockModel extends AnimatedGeoModel<RockStarChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarChicaTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/rchica.png");
	}
}
