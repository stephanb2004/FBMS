package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet1DisplayModel;
import net.mcreator.fbms.block.display.NeonPartySet1DisplayItem;

public class NeonPartySet1DisplayItemRenderer extends GeoItemRenderer<NeonPartySet1DisplayItem> {
	public NeonPartySet1DisplayItemRenderer() {
		super(new NeonPartySet1DisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
