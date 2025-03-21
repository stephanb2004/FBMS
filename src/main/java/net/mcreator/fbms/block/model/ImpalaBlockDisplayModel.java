package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ImpalaBlockDisplayItem;

public class ImpalaBlockDisplayModel extends GeoModel<ImpalaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ImpalaBlockDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/chevrolet_impala_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ImpalaBlockDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/chevrolet_impala_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImpalaBlockDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/purplechevroletimpala1961akastaticsride.png");
	}
}
