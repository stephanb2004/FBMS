package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ElChipTileEntity;

public class ElChipBlockModel extends GeoModel<ElChipTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElChipTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/elchipblockv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/elchipblockv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/elchipv2.png");
	}
}
