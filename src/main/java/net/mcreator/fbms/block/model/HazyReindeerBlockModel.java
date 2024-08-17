package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HazyReindeerTileEntity;

public class HazyReindeerBlockModel extends AnimatedGeoModel<HazyReindeerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/hazyreindeer_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/hazyreindeer_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HazyReindeerTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/hazy_reindeer.png");
	}
}
