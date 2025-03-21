package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RetroChicaDisplayModel;
import net.mcreator.fbms.block.display.RetroChicaDisplayItem;

public class RetroChicaDisplayItemRenderer extends GeoItemRenderer<RetroChicaDisplayItem> {
	public RetroChicaDisplayItemRenderer() {
		super(new RetroChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
