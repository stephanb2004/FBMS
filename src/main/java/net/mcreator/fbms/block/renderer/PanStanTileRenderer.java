package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PanStanBlockModel;
import net.mcreator.fbms.block.entity.PanStanTileEntity;

public class PanStanTileRenderer extends GeoBlockRenderer<PanStanTileEntity> {
	public PanStanTileRenderer() {
		super(new PanStanBlockModel());
	}

	@Override
	public RenderType getRenderType(PanStanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
