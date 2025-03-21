package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeddBearDisplayModel;
import net.mcreator.fbms.block.display.NeddBearDisplayItem;

public class NeddBearDisplayItemRenderer extends GeoItemRenderer<NeddBearDisplayItem> {
	public NeddBearDisplayItemRenderer() {
		super(new NeddBearDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeddBearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
