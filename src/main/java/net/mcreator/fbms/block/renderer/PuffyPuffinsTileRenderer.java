package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PuffyPuffinsBlockModel;
import net.mcreator.fbms.block.entity.PuffyPuffinsTileEntity;

public class PuffyPuffinsTileRenderer extends GeoBlockRenderer<PuffyPuffinsTileEntity> {
	public PuffyPuffinsTileRenderer() {
		super(new PuffyPuffinsBlockModel());
	}

	@Override
	public RenderType getRenderType(PuffyPuffinsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
