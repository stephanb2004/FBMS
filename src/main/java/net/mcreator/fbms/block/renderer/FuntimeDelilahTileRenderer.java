package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FuntimeDelilahBlockModel;
import net.mcreator.fbms.block.entity.FuntimeDelilahTileEntity;

public class FuntimeDelilahTileRenderer extends GeoBlockRenderer<FuntimeDelilahTileEntity> {
	public FuntimeDelilahTileRenderer() {
		super(new FuntimeDelilahBlockModel());
	}

	@Override
	public RenderType getRenderType(FuntimeDelilahTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
