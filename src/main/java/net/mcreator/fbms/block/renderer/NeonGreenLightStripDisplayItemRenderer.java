package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonGreenLightStripDisplayModel;
import net.mcreator.fbms.block.display.NeonGreenLightStripDisplayItem;

public class NeonGreenLightStripDisplayItemRenderer extends GeoItemRenderer<NeonGreenLightStripDisplayItem> {
	public NeonGreenLightStripDisplayItemRenderer() {
		super(new NeonGreenLightStripDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonGreenLightStripDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
