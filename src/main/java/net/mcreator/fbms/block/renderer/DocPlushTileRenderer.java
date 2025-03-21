package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DocPlushBlockModel;
import net.mcreator.fbms.block.entity.DocPlushTileEntity;

public class DocPlushTileRenderer extends GeoBlockRenderer<DocPlushTileEntity> {
	public DocPlushTileRenderer() {
		super(new DocPlushBlockModel());
	}

	@Override
	public RenderType getRenderType(DocPlushTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
