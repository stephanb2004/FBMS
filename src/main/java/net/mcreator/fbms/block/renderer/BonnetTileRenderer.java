package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonnetBlockModel;
import net.mcreator.fbms.block.entity.BonnetTileEntity;

public class BonnetTileRenderer extends GeoBlockRenderer<BonnetTileEntity> {
	public BonnetTileRenderer() {
		super(new BonnetBlockModel());
	}

	@Override
	public RenderType getRenderType(BonnetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
