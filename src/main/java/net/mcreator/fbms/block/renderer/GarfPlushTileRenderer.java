package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GarfPlushBlockModel;
import net.mcreator.fbms.block.entity.GarfPlushTileEntity;

public class GarfPlushTileRenderer extends GeoBlockRenderer<GarfPlushTileEntity> {
	public GarfPlushTileRenderer() {
		super(new GarfPlushBlockModel());
	}

	@Override
	public RenderType getRenderType(GarfPlushTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
