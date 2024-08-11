package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CarnivalHoopsTileEntity;

public class CarnivalHoopsBlockModel extends AnimatedGeoModel<CarnivalHoopsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/carnival_hoops.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/carnival_hoops.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarnivalHoopsTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/carnival_hoops.png");
	}
}
