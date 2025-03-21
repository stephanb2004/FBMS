package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PinTheBowtieOnTheTieTheToyFreddyBlockModel;
import net.mcreator.fbms.block.entity.PinTheBowtieOnTheTieTheToyFreddyTileEntity;

public class PinTheBowtieOnTheTieTheToyFreddyTileRenderer extends GeoBlockRenderer<PinTheBowtieOnTheTieTheToyFreddyTileEntity> {
	public PinTheBowtieOnTheTieTheToyFreddyTileRenderer() {
		super(new PinTheBowtieOnTheTieTheToyFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieOnTheTieTheToyFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
