package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HappyFrogDisplayModel;
import net.mcreator.fbms.block.display.HappyFrogDisplayItem;

public class HappyFrogDisplayItemRenderer extends GeoItemRenderer<HappyFrogDisplayItem> {
	public HappyFrogDisplayItemRenderer() {
		super(new HappyFrogDisplayModel());
	}

	@Override
	public RenderType getRenderType(HappyFrogDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
