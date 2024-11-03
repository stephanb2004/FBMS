package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonJukeBoxOffTileEntity;

public class NeonJukeBoxOffBlockModel extends AnimatedGeoModel<NeonJukeBoxOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonJukeBoxOffTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_jukebox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonJukeBoxOffTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_jukebox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonJukeBoxOffTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_jukebox.png");
	}
}
