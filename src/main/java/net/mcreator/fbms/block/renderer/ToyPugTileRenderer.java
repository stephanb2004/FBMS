package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyPugBlockModel;
import net.mcreator.fbms.block.entity.ToyPugTileEntity;

public class ToyPugTileRenderer extends GeoBlockRenderer<ToyPugTileEntity> {
	public ToyPugTileRenderer() {
		super(new ToyPugBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyPugTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
