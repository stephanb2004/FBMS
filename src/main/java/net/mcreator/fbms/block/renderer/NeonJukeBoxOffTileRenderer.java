package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonJukeBoxOffBlockModel;
import net.mcreator.fbms.block.entity.NeonJukeBoxOffTileEntity;

public class NeonJukeBoxOffTileRenderer extends GeoBlockRenderer<NeonJukeBoxOffTileEntity> {
	public NeonJukeBoxOffTileRenderer() {
		super(new NeonJukeBoxOffBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonJukeBoxOffTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
