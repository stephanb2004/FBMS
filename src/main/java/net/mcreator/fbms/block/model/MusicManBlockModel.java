package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MusicManTileEntity;

public class MusicManBlockModel extends GeoModel<MusicManTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MusicManTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/music.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicManTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/music.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicManTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/musicman.png");
	}
}
