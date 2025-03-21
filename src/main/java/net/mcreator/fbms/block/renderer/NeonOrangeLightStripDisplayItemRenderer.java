package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonOrangeLightStripDisplayModel;
import net.mcreator.fbms.block.display.NeonOrangeLightStripDisplayItem;

public class NeonOrangeLightStripDisplayItemRenderer extends GeoItemRenderer<NeonOrangeLightStripDisplayItem> {
	public NeonOrangeLightStripDisplayItemRenderer() {
		super(new NeonOrangeLightStripDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonOrangeLightStripDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
