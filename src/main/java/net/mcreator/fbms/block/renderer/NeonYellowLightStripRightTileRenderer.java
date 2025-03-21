package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripRightBlockModel;
import net.mcreator.fbms.block.entity.NeonYellowLightStripRightTileEntity;

public class NeonYellowLightStripRightTileRenderer extends GeoBlockRenderer<NeonYellowLightStripRightTileEntity> {
	public NeonYellowLightStripRightTileRenderer() {
		super(new NeonYellowLightStripRightBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripRightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
