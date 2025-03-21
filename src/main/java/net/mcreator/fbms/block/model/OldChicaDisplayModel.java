package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OldChicaDisplayItem;

public class OldChicaDisplayModel extends GeoModel<OldChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dinerchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dinerchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/dinerchica.png");
	}
}
