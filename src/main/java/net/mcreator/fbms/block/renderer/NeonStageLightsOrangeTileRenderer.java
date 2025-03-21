package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonStageLightsOrangeBlockModel;
import net.mcreator.fbms.block.entity.NeonStageLightsOrangeTileEntity;

public class NeonStageLightsOrangeTileRenderer extends GeoBlockRenderer<NeonStageLightsOrangeTileEntity> {
	public NeonStageLightsOrangeTileRenderer() {
		super(new NeonStageLightsOrangeBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightsOrangeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
