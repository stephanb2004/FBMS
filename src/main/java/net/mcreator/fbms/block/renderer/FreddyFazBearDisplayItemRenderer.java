package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FreddyFazBearDisplayModel;
import net.mcreator.fbms.block.display.FreddyFazBearDisplayItem;

public class FreddyFazBearDisplayItemRenderer extends GeoItemRenderer<FreddyFazBearDisplayItem> {
	public FreddyFazBearDisplayItemRenderer() {
		super(new FreddyFazBearDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddyFazBearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
