package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LolbitRecordTileEntity;

public class LolbitRecordBlockModel extends GeoModel<LolbitRecordTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolbitRecordTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/lolbit_record.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolbitRecordTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/lolbit_record.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolbitRecordTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/lolbit_record.png");
	}
}
