package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PuppetBoxDisplayItem;

public class PuppetBoxDisplayModel extends GeoModel<PuppetBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/box_1.png");
	}
}
