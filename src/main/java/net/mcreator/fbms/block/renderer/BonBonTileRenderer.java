package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonBonBlockModel;
import net.mcreator.fbms.block.entity.BonBonTileEntity;

public class BonBonTileRenderer extends GeoBlockRenderer<BonBonTileEntity> {
	public BonBonTileRenderer() {
		super(new BonBonBlockModel());
	}

	@Override
	public RenderType getRenderType(BonBonTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
