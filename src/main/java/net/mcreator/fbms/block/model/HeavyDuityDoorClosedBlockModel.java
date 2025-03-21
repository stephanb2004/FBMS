package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HeavyDuityDoorClosedTileEntity;

public class HeavyDuityDoorClosedBlockModel extends GeoModel<HeavyDuityDoorClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HeavyDuityDoorClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/metaldoorclose.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyDuityDoorClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/metaldoorclose.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyDuityDoorClosedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/crashdoor.png");
	}
}
