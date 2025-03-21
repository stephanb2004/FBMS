package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonJukeBoxDisplayModel;
import net.mcreator.fbms.block.display.NeonJukeBoxDisplayItem;

public class NeonJukeBoxDisplayItemRenderer extends GeoItemRenderer<NeonJukeBoxDisplayItem> {
	public NeonJukeBoxDisplayItemRenderer() {
		super(new NeonJukeBoxDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonJukeBoxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
