package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FoilPartySet2TileEntity;

public class FoilPartySet2BlockModel extends AnimatedGeoModel<FoilPartySet2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoilPartySet2TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/foil_party_set_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoilPartySet2TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/foil_party_set_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoilPartySet2TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/foilsettexture-2.png");
	}
}
