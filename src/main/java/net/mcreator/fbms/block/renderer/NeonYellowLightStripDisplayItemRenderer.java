package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripDisplayModel;
import net.mcreator.fbms.block.display.NeonYellowLightStripDisplayItem;

public class NeonYellowLightStripDisplayItemRenderer extends GeoItemRenderer<NeonYellowLightStripDisplayItem> {
	public NeonYellowLightStripDisplayItemRenderer() {
		super(new NeonYellowLightStripDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
