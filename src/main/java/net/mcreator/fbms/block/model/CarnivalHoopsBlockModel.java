package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CarnivalHoopsTileEntity;

public class CarnivalHoopsBlockModel extends GeoModel<CarnivalHoopsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/carnival_hoops.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/carnival_hoops.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/carnival_hoops.png");
	}
}
