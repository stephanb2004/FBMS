package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FredBearBlockModel;
import net.mcreator.fbms.block.entity.FredBearTileEntity;

public class FredBearTileRenderer extends GeoBlockRenderer<FredBearTileEntity> {
	public FredBearTileRenderer() {
		super(new FredBearBlockModel());
	}

	@Override
	public RenderType getRenderType(FredBearTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
