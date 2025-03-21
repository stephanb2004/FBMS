package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BarryPolarDisplayModel;
import net.mcreator.fbms.block.display.BarryPolarDisplayItem;

public class BarryPolarDisplayItemRenderer extends GeoItemRenderer<BarryPolarDisplayItem> {
	public BarryPolarDisplayItemRenderer() {
		super(new BarryPolarDisplayModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
