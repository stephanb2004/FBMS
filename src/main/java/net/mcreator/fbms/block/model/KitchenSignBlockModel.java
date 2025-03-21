package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.KitchenSignTileEntity;

public class KitchenSignBlockModel extends GeoModel<KitchenSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(KitchenSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KitchenSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KitchenSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/kitchensign.png");
	}
}
