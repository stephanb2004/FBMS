package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GtEndoBlockModel;
import net.mcreator.fbms.block.entity.GtEndoTileEntity;

public class GtEndoTileRenderer extends GeoBlockRenderer<GtEndoTileEntity> {
	public GtEndoTileRenderer() {
		super(new GtEndoBlockModel());
	}

	@Override
	public RenderType getRenderType(GtEndoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
