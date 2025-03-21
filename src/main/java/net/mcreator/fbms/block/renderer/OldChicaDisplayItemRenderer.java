package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldChicaDisplayModel;
import net.mcreator.fbms.block.display.OldChicaDisplayItem;

public class OldChicaDisplayItemRenderer extends GeoItemRenderer<OldChicaDisplayItem> {
	public OldChicaDisplayItemRenderer() {
		super(new OldChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(OldChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
