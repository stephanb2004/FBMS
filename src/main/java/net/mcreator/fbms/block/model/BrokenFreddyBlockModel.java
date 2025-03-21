package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BrokenFreddyTileEntity;

public class BrokenFreddyBlockModel extends GeoModel<BrokenFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freddybroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freddybroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/freddybroken.png");
	}
}
