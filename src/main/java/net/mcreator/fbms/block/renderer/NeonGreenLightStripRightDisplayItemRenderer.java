package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonGreenLightStripRightDisplayModel;
import net.mcreator.fbms.block.display.NeonGreenLightStripRightDisplayItem;

public class NeonGreenLightStripRightDisplayItemRenderer extends GeoItemRenderer<NeonGreenLightStripRightDisplayItem> {
	public NeonGreenLightStripRightDisplayItemRenderer() {
		super(new NeonGreenLightStripRightDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonGreenLightStripRightDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
