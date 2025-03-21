package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BalloonBoyDisplayItem;

public class BalloonBoyDisplayModel extends GeoModel<BalloonBoyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBoyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBoyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBoyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/bb.png");
	}
}
