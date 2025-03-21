package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ChicaDisplayModel;
import net.mcreator.fbms.block.display.ChicaDisplayItem;

public class ChicaDisplayItemRenderer extends GeoItemRenderer<ChicaDisplayItem> {
	public ChicaDisplayItemRenderer() {
		super(new ChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
