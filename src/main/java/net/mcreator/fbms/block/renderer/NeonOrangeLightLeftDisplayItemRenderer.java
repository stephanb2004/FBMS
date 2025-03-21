package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonOrangeLightLeftDisplayModel;
import net.mcreator.fbms.block.display.NeonOrangeLightLeftDisplayItem;

public class NeonOrangeLightLeftDisplayItemRenderer extends GeoItemRenderer<NeonOrangeLightLeftDisplayItem> {
	public NeonOrangeLightLeftDisplayItemRenderer() {
		super(new NeonOrangeLightLeftDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonOrangeLightLeftDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
