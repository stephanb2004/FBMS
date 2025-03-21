package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonJukeBoxOffDisplayModel;
import net.mcreator.fbms.block.display.NeonJukeBoxOffDisplayItem;

public class NeonJukeBoxOffDisplayItemRenderer extends GeoItemRenderer<NeonJukeBoxOffDisplayItem> {
	public NeonJukeBoxOffDisplayItemRenderer() {
		super(new NeonJukeBoxOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonJukeBoxOffDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
