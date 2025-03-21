package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonPartySet2DisplayItem;

public class NeonPartySet2DisplayModel extends GeoModel<NeonPartySet2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet2DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet2DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet2DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonsettexture-2.png");
	}
}
