package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.StephanPlushTileEntity;

public class StephanPlushBlockModel extends GeoModel<StephanPlushTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StephanPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/stephanplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StephanPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/stephanplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StephanPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/stephanplush.png");
	}
}
