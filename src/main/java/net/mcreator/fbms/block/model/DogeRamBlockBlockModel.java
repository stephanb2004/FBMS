package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DogeRamBlockTileEntity;

public class DogeRamBlockBlockModel extends GeoModel<DogeRamBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DogeRamBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/doge_ram_1982_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DogeRamBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/doge_ram_1982_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DogeRamBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/dodgeramakamoltensride.png");
	}
}
