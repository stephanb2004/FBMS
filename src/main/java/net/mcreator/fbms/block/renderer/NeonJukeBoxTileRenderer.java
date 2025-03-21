package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonJukeBoxBlockModel;
import net.mcreator.fbms.block.entity.NeonJukeBoxTileEntity;

public class NeonJukeBoxTileRenderer extends GeoBlockRenderer<NeonJukeBoxTileEntity> {
	public NeonJukeBoxTileRenderer() {
		super(new NeonJukeBoxBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonJukeBoxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
