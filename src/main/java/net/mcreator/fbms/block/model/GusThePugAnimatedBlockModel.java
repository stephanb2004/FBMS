package net.mcreator.fbms.block.model;

public class GusThePugAnimatedBlockModel extends AnimatedGeoModel<GusThePugAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/gus_the_pug_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/gus_the_pug_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/gus_the_pug.png");
	}
}