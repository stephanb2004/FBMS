package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PinTheBowtieOnTheTieTheToyFreddyTileEntity;

public class PinTheBowtieOnTheTieTheToyFreddyBlockModel extends GeoModel<PinTheBowtieOnTheTieTheToyFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieOnTheTieTheToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pin-the-bowtie-on-the-freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieOnTheTieTheToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pin-the-bowtie-on-the-freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieOnTheTieTheToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/pinthebowtietexture.png");
	}
}
