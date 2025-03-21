package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PaperPlatesBlockModel;
import net.mcreator.fbms.block.entity.PaperPlatesTileEntity;

public class PaperPlatesTileRenderer extends GeoBlockRenderer<PaperPlatesTileEntity> {
	public PaperPlatesTileRenderer() {
		super(new PaperPlatesBlockModel());
	}

	@Override
	public RenderType getRenderType(PaperPlatesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
