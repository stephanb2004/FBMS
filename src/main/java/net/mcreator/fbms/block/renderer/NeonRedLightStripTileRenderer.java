package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonRedLightStripBlockModel;
import net.mcreator.fbms.block.entity.NeonRedLightStripTileEntity;

public class NeonRedLightStripTileRenderer extends GeoBlockRenderer<NeonRedLightStripTileEntity> {
	public NeonRedLightStripTileRenderer() {
		super(new NeonRedLightStripBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonRedLightStripTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
