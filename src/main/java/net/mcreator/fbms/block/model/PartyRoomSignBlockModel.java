package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PartyRoomSignTileEntity;

public class PartyRoomSignBlockModel extends GeoModel<PartyRoomSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PartyRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PartyRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PartyRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/partyroomsign.png");
	}
}
