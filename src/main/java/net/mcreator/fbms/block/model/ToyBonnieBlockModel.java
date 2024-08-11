package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ToyBonnieTileEntity;

public class ToyBonnieBlockModel extends AnimatedGeoModel<ToyBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/toybonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/toybonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/tbonnie.png");
	}
}
