package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Fredbear01DisplayModel;
import net.mcreator.fbms.block.display.Fredbear01DisplayItem;

public class Fredbear01DisplayItemRenderer extends GeoItemRenderer<Fredbear01DisplayItem> {
	public Fredbear01DisplayItemRenderer() {
		super(new Fredbear01DisplayModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
