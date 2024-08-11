package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DocPlushTileEntity;

public class DocPlushBlockModel extends AnimatedGeoModel<DocPlushTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DocPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/docplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DocPlushTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/docplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DocPlushTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/docplush.png");
	}
}
