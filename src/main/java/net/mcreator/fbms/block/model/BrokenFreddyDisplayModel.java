package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BrokenFreddyDisplayItem;

public class BrokenFreddyDisplayModel extends GeoModel<BrokenFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freddybroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freddybroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/freddybroken.png");
	}
}
