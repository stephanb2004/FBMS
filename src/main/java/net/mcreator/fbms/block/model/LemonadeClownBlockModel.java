package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LemonadeClownTileEntity;

public class LemonadeClownBlockModel extends AnimatedGeoModel<LemonadeClownTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LemonadeClownTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/lemonade_clown.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LemonadeClownTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/lemonade_clown.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LemonadeClownTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/lemonade_clown.png");
	}
}
