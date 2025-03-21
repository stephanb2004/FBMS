package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonOrangeLightStripRightBlockModel;
import net.mcreator.fbms.block.entity.NeonOrangeLightStripRightTileEntity;

public class NeonOrangeLightStripRightTileRenderer extends GeoBlockRenderer<NeonOrangeLightStripRightTileEntity> {
	public NeonOrangeLightStripRightTileRenderer() {
		super(new NeonOrangeLightStripRightBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonOrangeLightStripRightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
