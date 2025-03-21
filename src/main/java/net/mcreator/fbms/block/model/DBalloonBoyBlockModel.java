package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DBalloonBoyTileEntity;

public class DBalloonBoyBlockModel extends GeoModel<DBalloonBoyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DBalloonBoyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dbb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DBalloonBoyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dbb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DBalloonBoyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/nmmbb.png");
	}
}
