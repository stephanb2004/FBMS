package net.mcreator.fbms.block.model;

public class GusThePugDisplayModel extends AnimatedGeoModel<GusThePugDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/gus_the_pug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/gus_the_pug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/gus_the_pug.png");
	}
}