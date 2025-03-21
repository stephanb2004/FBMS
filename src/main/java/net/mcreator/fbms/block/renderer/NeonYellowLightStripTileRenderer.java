package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripBlockModel;
import net.mcreator.fbms.block.entity.NeonYellowLightStripTileEntity;

public class NeonYellowLightStripTileRenderer extends GeoBlockRenderer<NeonYellowLightStripTileEntity> {
	public NeonYellowLightStripTileRenderer() {
		super(new NeonYellowLightStripBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
