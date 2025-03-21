package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightpinkBlockModel;
import net.mcreator.fbms.block.entity.CeilingStageLightpinkTileEntity;

public class CeilingStageLightpinkTileRenderer extends GeoBlockRenderer<CeilingStageLightpinkTileEntity> {
	public CeilingStageLightpinkTileRenderer() {
		super(new CeilingStageLightpinkBlockModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightpinkTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
