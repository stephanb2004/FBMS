package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BonnieTileEntity;

public class BonnieBlockModel extends AnimatedGeoModel<BonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/bonnie.png");
	}
}