package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PuppetBoxTileEntity;

public class PuppetBoxBlockModel extends AnimatedGeoModel<PuppetBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/box_1.png");
	}
}
