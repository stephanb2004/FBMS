package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonPartySet1TileEntity;

public class NeonPartySet1BlockModel extends GeoModel<NeonPartySet1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet1TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet1TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet1TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neonsettexture1.png");
	}
}
