package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonPartySet3TileEntity;

public class NeonPartySet3BlockModel extends GeoModel<NeonPartySet3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet3TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet3TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet3TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonpartyset3.png");
	}
}
