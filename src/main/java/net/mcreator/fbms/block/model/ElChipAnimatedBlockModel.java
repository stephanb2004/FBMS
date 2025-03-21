package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ElChipAnimatedTileEntity;

public class ElChipAnimatedBlockModel extends GeoModel<ElChipAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElChipAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/elchipanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/elchipanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/elchipv2.png");
	}
}
