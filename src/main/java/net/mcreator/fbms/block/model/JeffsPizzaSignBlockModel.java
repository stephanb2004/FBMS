package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.JeffsPizzaSignTileEntity;

public class JeffsPizzaSignBlockModel extends GeoModel<JeffsPizzaSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JeffsPizzaSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JeffsPizzaSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JeffsPizzaSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/jeffspizza.png");
	}
}
