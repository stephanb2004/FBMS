package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DBalloonBoyDisplayItem;

public class DBalloonBoyDisplayModel extends AnimatedGeoModel<DBalloonBoyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DBalloonBoyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dbb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DBalloonBoyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dbb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DBalloonBoyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/nmmbb.png");
	}
}
