package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CandyCadetDisplayModel;
import net.mcreator.fbms.block.display.CandyCadetDisplayItem;

public class CandyCadetDisplayItemRenderer extends GeoItemRenderer<CandyCadetDisplayItem> {
	public CandyCadetDisplayItemRenderer() {
		super(new CandyCadetDisplayModel());
	}

	@Override
	public RenderType getRenderType(CandyCadetDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
