package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LolbitRecordDisplayItem;

public class LolbitRecordDisplayModel extends GeoModel<LolbitRecordDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LolbitRecordDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/lolbit_record.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolbitRecordDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/lolbit_record.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolbitRecordDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/lolbit_record.png");
	}
}
