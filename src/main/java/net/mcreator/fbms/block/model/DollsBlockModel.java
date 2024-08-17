package net.mcreator.fbms.block.model;

public class DollsBlockModel extends AnimatedGeoModel<DollsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DollsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/docndtplush2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DollsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/docndtplush2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DollsTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/docndt.png");
	}
}