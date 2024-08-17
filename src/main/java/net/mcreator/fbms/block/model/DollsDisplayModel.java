package net.mcreator.fbms.block.model;

public class DollsDisplayModel extends AnimatedGeoModel<DollsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DollsDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/docndtplush2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DollsDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/docndtplush2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DollsDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/docndt.png");
	}
}