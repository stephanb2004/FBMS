package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FoilPartySet1DisplayItem;

public class FoilPartySet1DisplayModel extends GeoModel<FoilPartySet1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoilPartySet1DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/foil_party_set_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoilPartySet1DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/foil_party_set_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoilPartySet1DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/foilsettexture-1.png");
	}
}
