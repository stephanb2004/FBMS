package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonRedLightStripLeftBlockModel;
import net.mcreator.fbms.block.entity.NeonRedLightStripLeftTileEntity;

public class NeonRedLightStripLeftTileRenderer extends GeoBlockRenderer<NeonRedLightStripLeftTileEntity> {
	public NeonRedLightStripLeftTileRenderer() {
		super(new NeonRedLightStripLeftBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonRedLightStripLeftTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
