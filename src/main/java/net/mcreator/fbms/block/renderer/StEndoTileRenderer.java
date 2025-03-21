package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.StEndoBlockModel;
import net.mcreator.fbms.block.entity.StEndoTileEntity;

public class StEndoTileRenderer extends GeoBlockRenderer<StEndoTileEntity> {
	public StEndoTileRenderer() {
		super(new StEndoBlockModel());
	}

	@Override
	public RenderType getRenderType(StEndoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
