package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FredbearDeactivatedDisplayModel;
import net.mcreator.fbms.block.display.FredbearDeactivatedDisplayItem;

public class FredbearDeactivatedDisplayItemRenderer extends GeoItemRenderer<FredbearDeactivatedDisplayItem> {
	public FredbearDeactivatedDisplayItemRenderer() {
		super(new FredbearDeactivatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearDeactivatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
