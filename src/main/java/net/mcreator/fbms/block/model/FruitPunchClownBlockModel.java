package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FruitPunchClownTileEntity;

public class FruitPunchClownBlockModel extends AnimatedGeoModel<FruitPunchClownTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FruitPunchClownTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fruint_punch_clown.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FruitPunchClownTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fruint_punch_clown.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FruitPunchClownTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fruit_punch_clown.png");
	}
}
