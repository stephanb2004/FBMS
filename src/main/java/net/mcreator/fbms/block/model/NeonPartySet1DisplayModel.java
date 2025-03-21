package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonPartySet1DisplayItem;

public class NeonPartySet1DisplayModel extends GeoModel<NeonPartySet1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonPartySet1DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_party_set_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonPartySet1DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_party_set_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonPartySet1DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonsettexture1.png");
	}
}
