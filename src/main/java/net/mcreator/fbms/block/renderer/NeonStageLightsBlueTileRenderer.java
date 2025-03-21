package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonStageLightsBlueBlockModel;
import net.mcreator.fbms.block.entity.NeonStageLightsBlueTileEntity;

public class NeonStageLightsBlueTileRenderer extends GeoBlockRenderer<NeonStageLightsBlueTileEntity> {
	public NeonStageLightsBlueTileRenderer() {
		super(new NeonStageLightsBlueBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightsBlueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
