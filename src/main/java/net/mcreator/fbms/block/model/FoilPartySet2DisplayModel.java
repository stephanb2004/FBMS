package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FoilPartySet2DisplayItem;

public class FoilPartySet2DisplayModel extends GeoModel<FoilPartySet2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoilPartySet2DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/foil_party_set_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoilPartySet2DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/foil_party_set_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoilPartySet2DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/foilsettexture-2.png");
	}
}
