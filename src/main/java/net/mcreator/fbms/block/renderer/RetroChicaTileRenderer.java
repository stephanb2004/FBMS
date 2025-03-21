package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RetroChicaBlockModel;
import net.mcreator.fbms.block.entity.RetroChicaTileEntity;

public class RetroChicaTileRenderer extends GeoBlockRenderer<RetroChicaTileEntity> {
	public RetroChicaTileRenderer() {
		super(new RetroChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
