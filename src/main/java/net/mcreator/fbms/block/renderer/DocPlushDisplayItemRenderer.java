package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DocPlushDisplayModel;
import net.mcreator.fbms.block.display.DocPlushDisplayItem;

public class DocPlushDisplayItemRenderer extends GeoItemRenderer<DocPlushDisplayItem> {
	public DocPlushDisplayItemRenderer() {
		super(new DocPlushDisplayModel());
	}

	@Override
	public RenderType getRenderType(DocPlushDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
