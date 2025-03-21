package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LemonadeClownDisplayModel;
import net.mcreator.fbms.block.display.LemonadeClownDisplayItem;

public class LemonadeClownDisplayItemRenderer extends GeoItemRenderer<LemonadeClownDisplayItem> {
	public LemonadeClownDisplayItemRenderer() {
		super(new LemonadeClownDisplayModel());
	}

	@Override
	public RenderType getRenderType(LemonadeClownDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
