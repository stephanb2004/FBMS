package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FoilPartySet3TileEntity;

public class FoilPartySet3BlockModel extends AnimatedGeoModel<FoilPartySet3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoilPartySet3TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/foil_party_set_4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoilPartySet3TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/foil_party_set_4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoilPartySet3TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/foilsettexture-3.png");
	}
}
