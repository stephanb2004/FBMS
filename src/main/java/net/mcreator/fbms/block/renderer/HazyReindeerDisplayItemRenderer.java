package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HazyReindeerDisplayModel;
import net.mcreator.fbms.block.display.HazyReindeerDisplayItem;

public class HazyReindeerDisplayItemRenderer extends GeoItemRenderer<HazyReindeerDisplayItem> {
	public HazyReindeerDisplayItemRenderer() {
		super(new HazyReindeerDisplayModel());
	}

	@Override
	public RenderType getRenderType(HazyReindeerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
