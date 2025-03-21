package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FoilPartySet4TileEntity;

public class FoilPartySet4BlockModel extends GeoModel<FoilPartySet4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoilPartySet4TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/foil_party_set_4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoilPartySet4TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/foil_party_set_4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoilPartySet4TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/foilsettexture-4.png");
	}
}
