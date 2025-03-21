package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet4DisplayModel;
import net.mcreator.fbms.block.display.NeonPartySet4DisplayItem;

public class NeonPartySet4DisplayItemRenderer extends GeoItemRenderer<NeonPartySet4DisplayItem> {
	public NeonPartySet4DisplayItemRenderer() {
		super(new NeonPartySet4DisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet4DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
