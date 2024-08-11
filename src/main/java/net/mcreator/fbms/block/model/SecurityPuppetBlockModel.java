package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SecurityPuppetTileEntity;

public class SecurityPuppetBlockModel extends AnimatedGeoModel<SecurityPuppetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SecurityPuppetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/puppetblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecurityPuppetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/puppetblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecurityPuppetTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/puppet.png");
	}
}
