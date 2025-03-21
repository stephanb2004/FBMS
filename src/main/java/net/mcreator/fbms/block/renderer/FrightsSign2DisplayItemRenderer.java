package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FrightsSign2DisplayModel;
import net.mcreator.fbms.block.display.FrightsSign2DisplayItem;

public class FrightsSign2DisplayItemRenderer extends GeoItemRenderer<FrightsSign2DisplayItem> {
	public FrightsSign2DisplayItemRenderer() {
		super(new FrightsSign2DisplayModel());
	}

	@Override
	public RenderType getRenderType(FrightsSign2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
