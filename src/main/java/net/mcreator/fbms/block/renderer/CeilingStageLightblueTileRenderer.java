package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightblueBlockModel;
import net.mcreator.fbms.block.entity.CeilingStageLightblueTileEntity;

public class CeilingStageLightblueTileRenderer extends GeoBlockRenderer<CeilingStageLightblueTileEntity> {
	public CeilingStageLightblueTileRenderer() {
		super(new CeilingStageLightblueBlockModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightblueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
