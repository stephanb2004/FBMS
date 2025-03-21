package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonRedLightStripRightBlockModel;
import net.mcreator.fbms.block.entity.NeonRedLightStripRightTileEntity;

public class NeonRedLightStripRightTileRenderer extends GeoBlockRenderer<NeonRedLightStripRightTileEntity> {
	public NeonRedLightStripRightTileRenderer() {
		super(new NeonRedLightStripRightBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonRedLightStripRightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
