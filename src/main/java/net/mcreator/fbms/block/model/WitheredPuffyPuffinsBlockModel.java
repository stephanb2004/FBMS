package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WitheredPuffyPuffinsTileEntity;

public class WitheredPuffyPuffinsBlockModel extends AnimatedGeoModel<WitheredPuffyPuffinsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredPuffyPuffinsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/withered_puffypuffins.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredPuffyPuffinsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/withered_puffypuffins.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredPuffyPuffinsTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/puffy_puffins_withered.png");
	}
}
