package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RoseyDisplayModel;
import net.mcreator.fbms.block.display.RoseyDisplayItem;

public class RoseyDisplayItemRenderer extends GeoItemRenderer<RoseyDisplayItem> {
	public RoseyDisplayItemRenderer() {
		super(new RoseyDisplayModel());
	}

	@Override
	public RenderType getRenderType(RoseyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
