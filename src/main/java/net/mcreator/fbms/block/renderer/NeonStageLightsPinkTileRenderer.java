package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonStageLightsPinkBlockModel;
import net.mcreator.fbms.block.entity.NeonStageLightsPinkTileEntity;

public class NeonStageLightsPinkTileRenderer extends GeoBlockRenderer<NeonStageLightsPinkTileEntity> {
	public NeonStageLightsPinkTileRenderer() {
		super(new NeonStageLightsPinkBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightsPinkTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
