package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PigPatchAnimatedTileEntity;

public class PigPatchAnimatedBlockModel extends AnimatedGeoModel<PigPatchAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PigPatchAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pigpatchanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PigPatchAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pigpatchanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PigPatchAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/pigpatchv2v2.png");
	}
}
