package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SecurityPuppetTileEntity;

public class SecurityPuppetBlockModel extends GeoModel<SecurityPuppetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SecurityPuppetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/puppetblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecurityPuppetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/puppetblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecurityPuppetTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/puppet.png");
	}
}
