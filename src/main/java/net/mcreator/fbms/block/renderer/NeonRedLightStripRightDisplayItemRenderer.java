package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonRedLightStripRightDisplayModel;
import net.mcreator.fbms.block.display.NeonRedLightStripRightDisplayItem;

public class NeonRedLightStripRightDisplayItemRenderer extends GeoItemRenderer<NeonRedLightStripRightDisplayItem> {
	public NeonRedLightStripRightDisplayItemRenderer() {
		super(new NeonRedLightStripRightDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonRedLightStripRightDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
