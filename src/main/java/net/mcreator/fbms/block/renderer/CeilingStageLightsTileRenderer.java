package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightsBlockModel;
import net.mcreator.fbms.block.entity.CeilingStageLightsTileEntity;

public class CeilingStageLightsTileRenderer extends GeoBlockRenderer<CeilingStageLightsTileEntity> {
	public CeilingStageLightsTileRenderer() {
		super(new CeilingStageLightsBlockModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
