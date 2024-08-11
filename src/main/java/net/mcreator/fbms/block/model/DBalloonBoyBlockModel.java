package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DBalloonBoyTileEntity;

public class DBalloonBoyBlockModel extends AnimatedGeoModel<DBalloonBoyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DBalloonBoyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dbb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DBalloonBoyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dbb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DBalloonBoyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/nmmbb.png");
	}
}
