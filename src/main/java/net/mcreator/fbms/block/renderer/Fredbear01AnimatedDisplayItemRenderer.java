package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Fredbear01AnimatedDisplayModel;
import net.mcreator.fbms.block.display.Fredbear01AnimatedDisplayItem;

public class Fredbear01AnimatedDisplayItemRenderer extends GeoItemRenderer<Fredbear01AnimatedDisplayItem> {
	public Fredbear01AnimatedDisplayItemRenderer() {
		super(new Fredbear01AnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01AnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
