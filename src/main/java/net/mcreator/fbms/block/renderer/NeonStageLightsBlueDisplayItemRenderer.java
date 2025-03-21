package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonStageLightsBlueDisplayModel;
import net.mcreator.fbms.block.display.NeonStageLightsBlueDisplayItem;

public class NeonStageLightsBlueDisplayItemRenderer extends GeoItemRenderer<NeonStageLightsBlueDisplayItem> {
	public NeonStageLightsBlueDisplayItemRenderer() {
		super(new NeonStageLightsBlueDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightsBlueDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
