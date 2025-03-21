package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyBonnieBlockModel;
import net.mcreator.fbms.block.entity.ToyBonnieTileEntity;

public class ToyBonnieTileRenderer extends GeoBlockRenderer<ToyBonnieTileEntity> {
	public ToyBonnieTileRenderer() {
		super(new ToyBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
