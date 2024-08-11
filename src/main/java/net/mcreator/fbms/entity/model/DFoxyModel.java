package net.mcreator.fbms.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DFoxyEntity;

public class DFoxyModel extends AnimatedGeoModel<DFoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DFoxyEntity entity) {
		return new ResourceLocation("fbms", "animations/dfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DFoxyEntity entity) {
		return new ResourceLocation("fbms", "geo/dfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DFoxyEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}