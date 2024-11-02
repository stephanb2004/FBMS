package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HelpyCutOutTileEntity;

public class HelpyCutOutBlockModel extends AnimatedGeoModel<HelpyCutOutTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HelpyCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HelpyCutOutTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HelpyCutOutTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/helpycutout.png");
	}
}
