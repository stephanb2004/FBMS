package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripLeftDisplayModel;
import net.mcreator.fbms.block.display.NeonYellowLightStripLeftDisplayItem;

public class NeonYellowLightStripLeftDisplayItemRenderer extends GeoItemRenderer<NeonYellowLightStripLeftDisplayItem> {
	public NeonYellowLightStripLeftDisplayItemRenderer() {
		super(new NeonYellowLightStripLeftDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripLeftDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
