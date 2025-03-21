package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonBlueLightStripRightDisplayModel;
import net.mcreator.fbms.block.display.NeonBlueLightStripRightDisplayItem;

public class NeonBlueLightStripRightDisplayItemRenderer extends GeoItemRenderer<NeonBlueLightStripRightDisplayItem> {
	public NeonBlueLightStripRightDisplayItemRenderer() {
		super(new NeonBlueLightStripRightDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonBlueLightStripRightDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
