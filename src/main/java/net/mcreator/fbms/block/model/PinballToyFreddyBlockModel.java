package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PinballToyFreddyTileEntity;

public class PinballToyFreddyBlockModel extends GeoModel<PinballToyFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pinball_machine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pinball_machine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/pinballmachine_tfreddy.png");
	}
}
