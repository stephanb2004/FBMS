package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonJukeBoxTileEntity;

public class NeonJukeBoxBlockModel extends GeoModel<NeonJukeBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonJukeBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neonjukeboxa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonJukeBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neonjukeboxa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonJukeBoxTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neon_jukebox_a.png");
	}
}
