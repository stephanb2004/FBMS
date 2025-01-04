package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RestRoomSignDisplayItem;

public class RestRoomSignDisplayModel extends AnimatedGeoModel<RestRoomSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RestRoomSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RestRoomSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RestRoomSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/restroomsign.png");
	}
}
