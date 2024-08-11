package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PinTheBowtieOnTheFreddyTileEntity;

public class PinTheBowtieOnTheFreddyBlockModel extends AnimatedGeoModel<PinTheBowtieOnTheFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieOnTheFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pin-the-bowtie-on-the-freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieOnTheFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pin-the-bowtie-on-the-freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieOnTheFreddyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/pinthebowtietexture2.png");
	}
}
