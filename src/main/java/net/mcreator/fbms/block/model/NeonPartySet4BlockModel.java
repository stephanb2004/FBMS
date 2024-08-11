package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonPartySet4TileEntity;

public class NeonPartySet4BlockModel extends AnimatedGeoModel<NeonPartySet4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet4TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet4TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet4TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonpartyset4.png");
	}
}
