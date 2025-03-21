package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyFoxyBlockModel;
import net.mcreator.fbms.block.entity.ToyFoxyTileEntity;

public class ToyFoxyTileRenderer extends GeoBlockRenderer<ToyFoxyTileEntity> {
	public ToyFoxyTileRenderer() {
		super(new ToyFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
