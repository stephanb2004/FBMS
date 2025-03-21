package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.KitchenSignBlockModel;
import net.mcreator.fbms.block.entity.KitchenSignTileEntity;

public class KitchenSignTileRenderer extends GeoBlockRenderer<KitchenSignTileEntity> {
	public KitchenSignTileRenderer() {
		super(new KitchenSignBlockModel());
	}

	@Override
	public RenderType getRenderType(KitchenSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
