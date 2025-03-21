package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PCDisplayItem;

public class PCDisplayModel extends GeoModel<PCDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PCDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/computer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PCDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/computer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PCDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/old_pc.png");
	}
}
