package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HeavyDuityDoorTileEntity;

public class HeavyDuityDoorBlockModel extends GeoModel<HeavyDuityDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HeavyDuityDoorTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/metaldooropen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyDuityDoorTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/metaldooropen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyDuityDoorTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/crashdoor.png");
	}
}
