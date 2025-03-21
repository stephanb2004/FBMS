package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BuffetEndoBlockModel;
import net.mcreator.fbms.block.entity.BuffetEndoTileEntity;

public class BuffetEndoTileRenderer extends GeoBlockRenderer<BuffetEndoTileEntity> {
	public BuffetEndoTileRenderer() {
		super(new BuffetEndoBlockModel());
	}

	@Override
	public RenderType getRenderType(BuffetEndoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
