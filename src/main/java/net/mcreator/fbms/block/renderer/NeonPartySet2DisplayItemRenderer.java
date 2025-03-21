package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet2DisplayModel;
import net.mcreator.fbms.block.display.NeonPartySet2DisplayItem;

public class NeonPartySet2DisplayItemRenderer extends GeoItemRenderer<NeonPartySet2DisplayItem> {
	public NeonPartySet2DisplayItemRenderer() {
		super(new NeonPartySet2DisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
