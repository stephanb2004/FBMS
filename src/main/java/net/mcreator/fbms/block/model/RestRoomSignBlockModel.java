package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RestRoomSignTileEntity;

public class RestRoomSignBlockModel extends GeoModel<RestRoomSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RestRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RestRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RestRoomSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/restroomsign.png");
	}
}
