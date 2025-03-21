package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightpinkDisplayModel;
import net.mcreator.fbms.block.display.CeilingStageLightpinkDisplayItem;

public class CeilingStageLightpinkDisplayItemRenderer extends GeoItemRenderer<CeilingStageLightpinkDisplayItem> {
	public CeilingStageLightpinkDisplayItemRenderer() {
		super(new CeilingStageLightpinkDisplayModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightpinkDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
