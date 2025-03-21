package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PartyRoomSignDisplayItem;

public class PartyRoomSignDisplayModel extends GeoModel<PartyRoomSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PartyRoomSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PartyRoomSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PartyRoomSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/partyroomsign.png");
	}
}
