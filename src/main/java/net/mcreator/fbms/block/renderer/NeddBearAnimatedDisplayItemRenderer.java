package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeddBearAnimatedDisplayModel;
import net.mcreator.fbms.block.display.NeddBearAnimatedDisplayItem;

public class NeddBearAnimatedDisplayItemRenderer extends GeoItemRenderer<NeddBearAnimatedDisplayItem> {
	public NeddBearAnimatedDisplayItemRenderer() {
		super(new NeddBearAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeddBearAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
