package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PartyRoomSignTileEntity;

public class PartyRoomSignBlockModel extends AnimatedGeoModel<PartyRoomSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PartyRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PartyRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PartyRoomSignTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/partyroomsign.png");
	}
}
