package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DogeRamBlockDisplayModel;
import net.mcreator.fbms.block.display.DogeRamBlockDisplayItem;

public class DogeRamBlockDisplayItemRenderer extends GeoItemRenderer<DogeRamBlockDisplayItem> {
	public DogeRamBlockDisplayItemRenderer() {
		super(new DogeRamBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DogeRamBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
