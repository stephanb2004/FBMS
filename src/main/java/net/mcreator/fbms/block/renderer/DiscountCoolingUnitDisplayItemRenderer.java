package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DiscountCoolingUnitDisplayModel;
import net.mcreator.fbms.block.display.DiscountCoolingUnitDisplayItem;

public class DiscountCoolingUnitDisplayItemRenderer extends GeoItemRenderer<DiscountCoolingUnitDisplayItem> {
	public DiscountCoolingUnitDisplayItemRenderer() {
		super(new DiscountCoolingUnitDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiscountCoolingUnitDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
