package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.IndigoBlockModel;
import net.mcreator.fbms.block.entity.IndigoTileEntity;

public class IndigoTileRenderer extends GeoBlockRenderer<IndigoTileEntity> {
	public IndigoTileRenderer() {
		super(new IndigoBlockModel());
	}

	@Override
	public RenderType getRenderType(IndigoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
