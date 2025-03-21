package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MrHugsDisplayItem;

public class MrHugsDisplayModel extends GeoModel<MrHugsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MrHugsDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/mr._hugs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHugsDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/mr._hugs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHugsDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/mrhugsdestroyerofhelpies.png");
	}
}
