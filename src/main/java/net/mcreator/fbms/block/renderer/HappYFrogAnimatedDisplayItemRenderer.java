package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HappYFrogAnimatedDisplayModel;
import net.mcreator.fbms.block.display.HappYFrogAnimatedDisplayItem;

public class HappYFrogAnimatedDisplayItemRenderer extends GeoItemRenderer<HappYFrogAnimatedDisplayItem> {
	public HappYFrogAnimatedDisplayItemRenderer() {
		super(new HappYFrogAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(HappYFrogAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
