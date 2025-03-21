package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SalvagedJollyDisplayModel;
import net.mcreator.fbms.block.display.SalvagedJollyDisplayItem;

public class SalvagedJollyDisplayItemRenderer extends GeoItemRenderer<SalvagedJollyDisplayItem> {
	public SalvagedJollyDisplayItemRenderer() {
		super(new SalvagedJollyDisplayModel());
	}

	@Override
	public RenderType getRenderType(SalvagedJollyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
