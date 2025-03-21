package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonStageLightGreenDisplayModel;
import net.mcreator.fbms.block.display.NeonStageLightGreenDisplayItem;

public class NeonStageLightGreenDisplayItemRenderer extends GeoItemRenderer<NeonStageLightGreenDisplayItem> {
	public NeonStageLightGreenDisplayItemRenderer() {
		super(new NeonStageLightGreenDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightGreenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
