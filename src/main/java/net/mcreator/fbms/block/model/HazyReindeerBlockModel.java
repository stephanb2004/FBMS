package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HazyReindeerTileEntity;

public class HazyReindeerBlockModel extends GeoModel<HazyReindeerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/hazyreindeer_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/hazyreindeer_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/hazy_reindeer.png");
	}
}
