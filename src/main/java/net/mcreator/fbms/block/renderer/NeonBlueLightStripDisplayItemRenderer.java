package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonBlueLightStripDisplayModel;
import net.mcreator.fbms.block.display.NeonBlueLightStripDisplayItem;

public class NeonBlueLightStripDisplayItemRenderer extends GeoItemRenderer<NeonBlueLightStripDisplayItem> {
	public NeonBlueLightStripDisplayItemRenderer() {
		super(new NeonBlueLightStripDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonBlueLightStripDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
