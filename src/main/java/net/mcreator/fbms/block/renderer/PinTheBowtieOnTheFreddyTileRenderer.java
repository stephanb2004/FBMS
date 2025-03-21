package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PinTheBowtieOnTheFreddyBlockModel;
import net.mcreator.fbms.block.entity.PinTheBowtieOnTheFreddyTileEntity;

public class PinTheBowtieOnTheFreddyTileRenderer extends GeoBlockRenderer<PinTheBowtieOnTheFreddyTileEntity> {
	public PinTheBowtieOnTheFreddyTileRenderer() {
		super(new PinTheBowtieOnTheFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieOnTheFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
