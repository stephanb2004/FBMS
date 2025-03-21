package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OrvilleDisplayItem;

public class OrvilleDisplayModel extends GeoModel<OrvilleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/orvilleblockv2v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/orvilleblockv2v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/magicv2v2.png");
	}
}
