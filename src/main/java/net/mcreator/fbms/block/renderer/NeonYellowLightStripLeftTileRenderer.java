package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripLeftBlockModel;
import net.mcreator.fbms.block.entity.NeonYellowLightStripLeftTileEntity;

public class NeonYellowLightStripLeftTileRenderer extends GeoBlockRenderer<NeonYellowLightStripLeftTileEntity> {
	public NeonYellowLightStripLeftTileRenderer() {
		super(new NeonYellowLightStripLeftBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripLeftTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
