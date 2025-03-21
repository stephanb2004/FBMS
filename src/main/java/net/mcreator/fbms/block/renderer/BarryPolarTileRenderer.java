package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BarryPolarBlockModel;
import net.mcreator.fbms.block.entity.BarryPolarTileEntity;

public class BarryPolarTileRenderer extends GeoBlockRenderer<BarryPolarTileEntity> {
	public BarryPolarTileRenderer() {
		super(new BarryPolarBlockModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
