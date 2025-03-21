package net.mcreator.fbms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.MysteriousGiantScuttlersEntity;

public class MysteriousGiantScuttlersModel extends GeoModel<MysteriousGiantScuttlersEntity> {
	@Override
	public ResourceLocation getAnimationResource(MysteriousGiantScuttlersEntity entity) {
		return new ResourceLocation("fbms", "animations/scutler.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MysteriousGiantScuttlersEntity entity) {
		return new ResourceLocation("fbms", "geo/scutler.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MysteriousGiantScuttlersEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
