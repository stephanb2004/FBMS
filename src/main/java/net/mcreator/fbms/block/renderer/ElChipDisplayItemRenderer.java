package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ElChipDisplayModel;
import net.mcreator.fbms.block.display.ElChipDisplayItem;

public class ElChipDisplayItemRenderer extends GeoItemRenderer<ElChipDisplayItem> {
	public ElChipDisplayItemRenderer() {
		super(new ElChipDisplayModel());
	}

	@Override
	public RenderType getRenderType(ElChipDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
