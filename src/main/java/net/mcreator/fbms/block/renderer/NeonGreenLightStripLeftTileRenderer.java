package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonGreenLightStripLeftBlockModel;
import net.mcreator.fbms.block.entity.NeonGreenLightStripLeftTileEntity;

public class NeonGreenLightStripLeftTileRenderer extends GeoBlockRenderer<NeonGreenLightStripLeftTileEntity> {
	public NeonGreenLightStripLeftTileRenderer() {
		super(new NeonGreenLightStripLeftBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonGreenLightStripLeftTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
