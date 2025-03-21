package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonRedLightStripLeftDisplayModel;
import net.mcreator.fbms.block.display.NeonRedLightStripLeftDisplayItem;

public class NeonRedLightStripLeftDisplayItemRenderer extends GeoItemRenderer<NeonRedLightStripLeftDisplayItem> {
	public NeonRedLightStripLeftDisplayItemRenderer() {
		super(new NeonRedLightStripLeftDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonRedLightStripLeftDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
