package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PrizeCounterSignDisplayModel;
import net.mcreator.fbms.block.display.PrizeCounterSignDisplayItem;

public class PrizeCounterSignDisplayItemRenderer extends GeoItemRenderer<PrizeCounterSignDisplayItem> {
	public PrizeCounterSignDisplayItemRenderer() {
		super(new PrizeCounterSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(PrizeCounterSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
