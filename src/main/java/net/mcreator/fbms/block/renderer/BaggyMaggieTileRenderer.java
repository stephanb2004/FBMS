package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BaggyMaggieBlockModel;
import net.mcreator.fbms.block.entity.BaggyMaggieTileEntity;

public class BaggyMaggieTileRenderer extends GeoBlockRenderer<BaggyMaggieTileEntity> {
	public BaggyMaggieTileRenderer() {
		super(new BaggyMaggieBlockModel());
	}

	@Override
	public RenderType getRenderType(BaggyMaggieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
