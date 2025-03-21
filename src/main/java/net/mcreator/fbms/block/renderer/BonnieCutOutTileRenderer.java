package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonnieCutOutBlockModel;
import net.mcreator.fbms.block.entity.BonnieCutOutTileEntity;

public class BonnieCutOutTileRenderer extends GeoBlockRenderer<BonnieCutOutTileEntity> {
	public BonnieCutOutTileRenderer() {
		super(new BonnieCutOutBlockModel());
	}

	@Override
	public RenderType getRenderType(BonnieCutOutTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
