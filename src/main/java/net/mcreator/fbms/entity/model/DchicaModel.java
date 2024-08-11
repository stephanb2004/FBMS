package net.mcreator.fbms.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DchicaEntity;

public class DchicaModel extends AnimatedGeoModel<DchicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(DchicaEntity entity) {
		return new ResourceLocation("fbms", "animations/dchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DchicaEntity entity) {
		return new ResourceLocation("fbms", "geo/dchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DchicaEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
