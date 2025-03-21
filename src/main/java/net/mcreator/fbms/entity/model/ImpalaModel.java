package net.mcreator.fbms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.ImpalaEntity;

public class ImpalaModel extends GeoModel<ImpalaEntity> {
	@Override
	public ResourceLocation getAnimationResource(ImpalaEntity entity) {
		return new ResourceLocation("fbms", "animations/chevrolet_impala.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ImpalaEntity entity) {
		return new ResourceLocation("fbms", "geo/chevrolet_impala.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImpalaEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
