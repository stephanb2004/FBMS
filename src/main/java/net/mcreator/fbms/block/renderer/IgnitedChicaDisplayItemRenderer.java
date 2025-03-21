package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.IgnitedChicaDisplayModel;
import net.mcreator.fbms.block.display.IgnitedChicaDisplayItem;

public class IgnitedChicaDisplayItemRenderer extends GeoItemRenderer<IgnitedChicaDisplayItem> {
	public IgnitedChicaDisplayItemRenderer() {
		super(new IgnitedChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(IgnitedChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
