package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FoilPartySet1TileEntity;

public class FoilPartySet1BlockModel extends AnimatedGeoModel<FoilPartySet1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoilPartySet1TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/foil_party_set_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoilPartySet1TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/foil_party_set_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoilPartySet1TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/foilsettexture-1.png");
	}
}
