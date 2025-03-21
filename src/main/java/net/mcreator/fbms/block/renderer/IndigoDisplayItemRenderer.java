package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.IndigoDisplayModel;
import net.mcreator.fbms.block.display.IndigoDisplayItem;

public class IndigoDisplayItemRenderer extends GeoItemRenderer<IndigoDisplayItem> {
	public IndigoDisplayItemRenderer() {
		super(new IndigoDisplayModel());
	}

	@Override
	public RenderType getRenderType(IndigoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
