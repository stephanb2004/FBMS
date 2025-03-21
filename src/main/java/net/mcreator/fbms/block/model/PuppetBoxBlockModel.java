package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PuppetBoxTileEntity;

public class PuppetBoxBlockModel extends GeoModel<PuppetBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/box_1.png");
	}
}
