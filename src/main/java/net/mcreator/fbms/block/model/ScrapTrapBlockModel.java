package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ScrapTrapTileEntity;

public class ScrapTrapBlockModel extends GeoModel<ScrapTrapTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScrapTrapTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/scraptrapblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapTrapTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/scraptrapblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapTrapTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/scraptrap.png");
	}
}
