package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MrHippoAnimatedTileEntity;

public class MrHippoAnimatedBlockModel extends AnimatedGeoModel<MrHippoAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mrhippoanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mrhippoanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/mrhippov2.png");
	}
}
