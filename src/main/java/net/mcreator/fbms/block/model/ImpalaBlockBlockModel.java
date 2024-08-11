package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ImpalaBlockTileEntity;

public class ImpalaBlockBlockModel extends AnimatedGeoModel<ImpalaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ImpalaBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/chevrolet_impala_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ImpalaBlockTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/chevrolet_impala_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImpalaBlockTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/purplechevroletimpala1961akastaticsride.png");
	}
}
