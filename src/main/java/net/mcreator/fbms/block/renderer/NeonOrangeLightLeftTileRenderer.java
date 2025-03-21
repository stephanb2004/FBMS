package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonOrangeLightLeftBlockModel;
import net.mcreator.fbms.block.entity.NeonOrangeLightLeftTileEntity;

public class NeonOrangeLightLeftTileRenderer extends GeoBlockRenderer<NeonOrangeLightLeftTileEntity> {
	public NeonOrangeLightLeftTileRenderer() {
		super(new NeonOrangeLightLeftBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonOrangeLightLeftTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
