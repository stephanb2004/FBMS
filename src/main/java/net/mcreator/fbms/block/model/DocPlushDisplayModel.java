package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DocPlushDisplayItem;

public class DocPlushDisplayModel extends AnimatedGeoModel<DocPlushDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DocPlushDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/docplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DocPlushDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/docplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DocPlushDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/docplush.png");
	}
}