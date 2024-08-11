package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HappyFrogTileEntity;

public class HappyFrogBlockModel extends AnimatedGeoModel<HappyFrogTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HappyFrogTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/happyfrogblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappyFrogTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/happyfrogblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappyFrogTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/happyfrog.png");
	}
}
