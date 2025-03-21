package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonPartySet4DisplayItem;

public class NeonPartySet4DisplayModel extends GeoModel<NeonPartySet4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet4DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet4DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet4DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonpartyset4.png");
	}
}
