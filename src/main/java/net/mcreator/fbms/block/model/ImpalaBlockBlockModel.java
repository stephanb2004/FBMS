package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ImpalaBlockTileEntity;

public class ImpalaBlockBlockModel extends GeoModel<ImpalaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ImpalaBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/chevrolet_impala_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ImpalaBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/chevrolet_impala_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImpalaBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/purplechevroletimpala1961akastaticsride.png");
	}
}
