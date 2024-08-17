package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.JeffsPizzaSignTileEntity;

public class JeffsPizzaSignBlockModel extends AnimatedGeoModel<JeffsPizzaSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JeffsPizzaSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JeffsPizzaSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JeffsPizzaSignTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/jeffspizza.png");
	}
}
