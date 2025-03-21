package net.mcreator.fbms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DfredbearEntity;

public class DfredbearModel extends GeoModel<DfredbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(DfredbearEntity entity) {
		return new ResourceLocation("fbms", "animations/dfredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DfredbearEntity entity) {
		return new ResourceLocation("fbms", "geo/dfredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DfredbearEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
