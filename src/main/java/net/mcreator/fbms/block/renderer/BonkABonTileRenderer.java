package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonkABonBlockModel;
import net.mcreator.fbms.block.entity.BonkABonTileEntity;

public class BonkABonTileRenderer extends GeoBlockRenderer<BonkABonTileEntity> {
	public BonkABonTileRenderer() {
		super(new BonkABonBlockModel());
	}

	@Override
	public RenderType getRenderType(BonkABonTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
