package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RetroChicaAnimatedBlockModel;
import net.mcreator.fbms.block.entity.RetroChicaAnimatedTileEntity;

public class RetroChicaAnimatedTileRenderer extends GeoBlockRenderer<RetroChicaAnimatedTileEntity> {
	public RetroChicaAnimatedTileRenderer() {
		super(new RetroChicaAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
