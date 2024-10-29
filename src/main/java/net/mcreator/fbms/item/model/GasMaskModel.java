package net.mcreator.fbms.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.item.GasMaskItem;

public class GasMaskModel extends AnimatedGeoModel<GasMaskItem> {
	@Override
	public ResourceLocation getAnimationResource(GasMaskItem object) {
		return new ResourceLocation("fbms", "animations/gasmask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GasMaskItem object) {
		return new ResourceLocation("fbms", "geo/gasmask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GasMaskItem object) {
		return new ResourceLocation("fbms", "textures/items/gasmasktexture.png");
	}
}
