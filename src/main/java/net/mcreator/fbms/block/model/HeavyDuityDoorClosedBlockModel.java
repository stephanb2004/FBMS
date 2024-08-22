package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HeavyDuityDoorClosedTileEntity;

public class HeavyDuityDoorClosedBlockModel extends AnimatedGeoModel<HeavyDuityDoorClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HeavyDuityDoorClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/metaldoorclose.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyDuityDoorClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/metaldoorclose.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyDuityDoorClosedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/crashdoor.png");
	}
}
