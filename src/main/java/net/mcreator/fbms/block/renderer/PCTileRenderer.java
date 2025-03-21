package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PCBlockModel;
import net.mcreator.fbms.block.entity.PCTileEntity;

public class PCTileRenderer extends GeoBlockRenderer<PCTileEntity> {
	public PCTileRenderer() {
		super(new PCBlockModel());
	}

	@Override
	public RenderType getRenderType(PCTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
