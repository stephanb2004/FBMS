package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MoltenSitTileEntity;

public class MoltenSitBlockModel extends GeoModel<MoltenSitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoltenSitTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/moltensit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenSitTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/moltensit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenSitTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/moltensit.png");
	}
}
