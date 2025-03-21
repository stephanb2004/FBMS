package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonPartySet2TileEntity;

public class NeonPartySet2BlockModel extends GeoModel<NeonPartySet2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet2TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet2TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet2TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonsettexture-2.png");
	}
}
