package net.mcreator.fbms.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DFreddyEntity;

public class DFreddyModel extends AnimatedGeoModel<DFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DFreddyEntity entity) {
		return new ResourceLocation("fbms", "animations/dfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DFreddyEntity entity) {
		return new ResourceLocation("fbms", "geo/dfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DFreddyEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
