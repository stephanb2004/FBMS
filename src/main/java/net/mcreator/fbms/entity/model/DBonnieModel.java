package net.mcreator.fbms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DBonnieEntity;

public class DBonnieModel extends GeoModel<DBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(DBonnieEntity entity) {
		return new ResourceLocation("fbms", "animations/dbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DBonnieEntity entity) {
		return new ResourceLocation("fbms", "geo/dbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DBonnieEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
