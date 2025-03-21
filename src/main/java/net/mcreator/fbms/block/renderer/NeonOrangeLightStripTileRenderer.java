package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonOrangeLightStripBlockModel;
import net.mcreator.fbms.block.entity.NeonOrangeLightStripTileEntity;

public class NeonOrangeLightStripTileRenderer extends GeoBlockRenderer<NeonOrangeLightStripTileEntity> {
	public NeonOrangeLightStripTileRenderer() {
		super(new NeonOrangeLightStripBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonOrangeLightStripTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
