package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PigPatchTileEntity;

public class PigPatchBlockModel extends AnimatedGeoModel<PigPatchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PigPatchTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pigpatchv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PigPatchTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pigpatchv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PigPatchTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/pigpatchv2v2.png");
	}
}
