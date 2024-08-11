package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MoldyRabbitTileEntity;

public class MoldyRabbitBlockModel extends AnimatedGeoModel<MoldyRabbitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoldyRabbitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/moldyrabit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoldyRabbitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/moldyrabit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoldyRabbitTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/springbonnie.png");
	}
}
