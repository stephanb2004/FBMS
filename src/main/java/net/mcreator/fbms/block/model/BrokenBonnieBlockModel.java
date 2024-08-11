package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BrokenBonnieTileEntity;

public class BrokenBonnieBlockModel extends AnimatedGeoModel<BrokenBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bonniebroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bonniebroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenBonnieTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/bonniebroken.png");
	}
}
