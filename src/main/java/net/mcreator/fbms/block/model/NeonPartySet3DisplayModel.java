package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonPartySet3DisplayItem;

public class NeonPartySet3DisplayModel extends GeoModel<NeonPartySet3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet3DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet3DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet3DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonpartyset3.png");
	}
}
