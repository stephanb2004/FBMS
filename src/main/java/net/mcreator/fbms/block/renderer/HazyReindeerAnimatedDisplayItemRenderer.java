package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HazyReindeerAnimatedDisplayModel;
import net.mcreator.fbms.block.display.HazyReindeerAnimatedDisplayItem;

public class HazyReindeerAnimatedDisplayItemRenderer extends GeoItemRenderer<HazyReindeerAnimatedDisplayItem> {
	public HazyReindeerAnimatedDisplayItemRenderer() {
		super(new HazyReindeerAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(HazyReindeerAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
