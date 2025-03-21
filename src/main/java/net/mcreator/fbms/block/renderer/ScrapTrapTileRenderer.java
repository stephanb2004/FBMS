package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ScrapTrapBlockModel;
import net.mcreator.fbms.block.entity.ScrapTrapTileEntity;

public class ScrapTrapTileRenderer extends GeoBlockRenderer<ScrapTrapTileEntity> {
	public ScrapTrapTileRenderer() {
		super(new ScrapTrapBlockModel());
	}

	@Override
	public RenderType getRenderType(ScrapTrapTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
