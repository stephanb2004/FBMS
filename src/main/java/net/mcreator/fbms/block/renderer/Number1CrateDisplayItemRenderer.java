package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Number1CrateDisplayModel;
import net.mcreator.fbms.block.display.Number1CrateDisplayItem;

public class Number1CrateDisplayItemRenderer extends GeoItemRenderer<Number1CrateDisplayItem> {
	public Number1CrateDisplayItemRenderer() {
		super(new Number1CrateDisplayModel());
	}

	@Override
	public RenderType getRenderType(Number1CrateDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
