package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonBlueLightStripLeftDisplayModel;
import net.mcreator.fbms.block.display.NeonBlueLightStripLeftDisplayItem;

public class NeonBlueLightStripLeftDisplayItemRenderer extends GeoItemRenderer<NeonBlueLightStripLeftDisplayItem> {
	public NeonBlueLightStripLeftDisplayItemRenderer() {
		super(new NeonBlueLightStripLeftDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonBlueLightStripLeftDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
