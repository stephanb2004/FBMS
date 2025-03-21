package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Endo01AnimatedDisplayModel;
import net.mcreator.fbms.block.display.Endo01AnimatedDisplayItem;

public class Endo01AnimatedDisplayItemRenderer extends GeoItemRenderer<Endo01AnimatedDisplayItem> {
	public Endo01AnimatedDisplayItemRenderer() {
		super(new Endo01AnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01AnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
