package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeddBearTileEntity;

public class NeddBearBlockModel extends GeoModel<NeddBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neddbearblockv2v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neddbearblockv2v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neddbearv2v2.png");
	}
}
