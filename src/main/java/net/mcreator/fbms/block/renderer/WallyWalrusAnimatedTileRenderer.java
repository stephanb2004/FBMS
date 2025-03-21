package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WallyWalrusAnimatedBlockModel;
import net.mcreator.fbms.block.entity.WallyWalrusAnimatedTileEntity;

public class WallyWalrusAnimatedTileRenderer extends GeoBlockRenderer<WallyWalrusAnimatedTileEntity> {
	public WallyWalrusAnimatedTileRenderer() {
		super(new WallyWalrusAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(WallyWalrusAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
