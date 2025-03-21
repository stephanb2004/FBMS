package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonStageLightsPinkDisplayModel;
import net.mcreator.fbms.block.display.NeonStageLightsPinkDisplayItem;

public class NeonStageLightsPinkDisplayItemRenderer extends GeoItemRenderer<NeonStageLightsPinkDisplayItem> {
	public NeonStageLightsPinkDisplayItemRenderer() {
		super(new NeonStageLightsPinkDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightsPinkDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
