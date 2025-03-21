package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripRightDisplayModel;
import net.mcreator.fbms.block.display.NeonYellowLightStripRightDisplayItem;

public class NeonYellowLightStripRightDisplayItemRenderer extends GeoItemRenderer<NeonYellowLightStripRightDisplayItem> {
	public NeonYellowLightStripRightDisplayItemRenderer() {
		super(new NeonYellowLightStripRightDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripRightDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
