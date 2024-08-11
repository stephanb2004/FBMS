package net.mcreator.fbms.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DogeRamEntity;

public class DogeRamModel extends AnimatedGeoModel<DogeRamEntity> {
	@Override
	public ResourceLocation getAnimationResource(DogeRamEntity entity) {
		return new ResourceLocation("fbms", "animations/doge_ram_1982.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DogeRamEntity entity) {
		return new ResourceLocation("fbms", "geo/doge_ram_1982.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DogeRamEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
