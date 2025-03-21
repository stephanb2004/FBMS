package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.JeffsPizzaSignDisplayItem;

public class JeffsPizzaSignDisplayModel extends GeoModel<JeffsPizzaSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JeffsPizzaSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JeffsPizzaSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JeffsPizzaSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/jeffspizza.png");
	}
}
