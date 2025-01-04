package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.KitchenSignDisplayItem;

public class KitchenSignDisplayModel extends AnimatedGeoModel<KitchenSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(KitchenSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KitchenSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KitchenSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/kitchensign.png");
	}
}
