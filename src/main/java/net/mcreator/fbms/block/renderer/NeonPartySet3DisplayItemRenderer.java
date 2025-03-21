package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet3DisplayModel;
import net.mcreator.fbms.block.display.NeonPartySet3DisplayItem;

public class NeonPartySet3DisplayItemRenderer extends GeoItemRenderer<NeonPartySet3DisplayItem> {
	public NeonPartySet3DisplayItemRenderer() {
		super(new NeonPartySet3DisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
