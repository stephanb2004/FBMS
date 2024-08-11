package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MrHugsTileEntity;

public class MrHugsBlockModel extends AnimatedGeoModel<MrHugsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHugsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mr._hugs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHugsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mr._hugs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHugsTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/mrhugsdestroyerofhelpies.png");
	}
}
