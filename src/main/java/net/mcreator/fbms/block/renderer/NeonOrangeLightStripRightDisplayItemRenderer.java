package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonOrangeLightStripRightDisplayModel;
import net.mcreator.fbms.block.display.NeonOrangeLightStripRightDisplayItem;

public class NeonOrangeLightStripRightDisplayItemRenderer extends GeoItemRenderer<NeonOrangeLightStripRightDisplayItem> {
	public NeonOrangeLightStripRightDisplayItemRenderer() {
		super(new NeonOrangeLightStripRightDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonOrangeLightStripRightDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
