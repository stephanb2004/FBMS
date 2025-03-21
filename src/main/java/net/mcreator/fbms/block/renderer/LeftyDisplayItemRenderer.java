package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LeftyDisplayModel;
import net.mcreator.fbms.block.display.LeftyDisplayItem;

public class LeftyDisplayItemRenderer extends GeoItemRenderer<LeftyDisplayItem> {
	public LeftyDisplayItemRenderer() {
		super(new LeftyDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeftyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
