package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonJukeBoxTileEntity;

public class NeonJukeBoxBlockModel extends AnimatedGeoModel<NeonJukeBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonJukeBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_jukebox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonJukeBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_jukebox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonJukeBoxTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_jukebox.png");
	}
}
