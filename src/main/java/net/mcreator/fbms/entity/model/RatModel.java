package net.mcreator.fbms.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.RatEntity;

public class RatModel extends AnimatedGeoModel<RatEntity> {
	@Override
	public ResourceLocation getAnimationResource(RatEntity entity) {
		return new ResourceLocation("fbms", "animations/rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatEntity entity) {
		return new ResourceLocation("fbms", "geo/rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}