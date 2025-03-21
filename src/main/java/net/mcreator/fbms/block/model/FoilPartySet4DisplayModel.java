package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FoilPartySet4DisplayItem;

public class FoilPartySet4DisplayModel extends GeoModel<FoilPartySet4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoilPartySet4DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/foil_party_set_4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoilPartySet4DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/foil_party_set_4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoilPartySet4DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/foilsettexture-4.png");
	}
}
