package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonGreenLightStripRightBlockModel;
import net.mcreator.fbms.block.entity.NeonGreenLightStripRightTileEntity;

public class NeonGreenLightStripRightTileRenderer extends GeoBlockRenderer<NeonGreenLightStripRightTileEntity> {
	public NeonGreenLightStripRightTileRenderer() {
		super(new NeonGreenLightStripRightBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonGreenLightStripRightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
