package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PuffyPuffinsTileEntity;

public class PuffyPuffinsBlockModel extends AnimatedGeoModel<PuffyPuffinsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuffyPuffinsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/puffypuffins_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuffyPuffinsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/puffypuffins_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuffyPuffinsTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/puffy_puffins.png");
	}
}
