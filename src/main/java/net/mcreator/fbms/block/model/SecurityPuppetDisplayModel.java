package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SecurityPuppetDisplayItem;

public class SecurityPuppetDisplayModel extends AnimatedGeoModel<SecurityPuppetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SecurityPuppetDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/puppetblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecurityPuppetDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/puppetblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecurityPuppetDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/puppet.png");
	}
}
