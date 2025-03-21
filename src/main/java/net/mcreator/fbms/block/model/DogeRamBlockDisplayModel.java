package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DogeRamBlockDisplayItem;

public class DogeRamBlockDisplayModel extends GeoModel<DogeRamBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DogeRamBlockDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/doge_ram_1982_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DogeRamBlockDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/doge_ram_1982_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DogeRamBlockDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/dodgeramakamoltensride.png");
	}
}
