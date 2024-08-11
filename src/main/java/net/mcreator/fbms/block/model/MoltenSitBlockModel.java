package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MoltenSitTileEntity;

public class MoltenSitBlockModel extends AnimatedGeoModel<MoltenSitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoltenSitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/moltenv2sit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenSitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/moltenv2sit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenSitTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/moltenv2.png");
	}
}
