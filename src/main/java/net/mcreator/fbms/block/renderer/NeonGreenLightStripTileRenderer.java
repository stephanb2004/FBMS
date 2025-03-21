package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonGreenLightStripBlockModel;
import net.mcreator.fbms.block.entity.NeonGreenLightStripTileEntity;

public class NeonGreenLightStripTileRenderer extends GeoBlockRenderer<NeonGreenLightStripTileEntity> {
	public NeonGreenLightStripTileRenderer() {
		super(new NeonGreenLightStripBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonGreenLightStripTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
