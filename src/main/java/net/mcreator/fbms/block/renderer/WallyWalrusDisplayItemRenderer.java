package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WallyWalrusDisplayModel;
import net.mcreator.fbms.block.display.WallyWalrusDisplayItem;

public class WallyWalrusDisplayItemRenderer extends GeoItemRenderer<WallyWalrusDisplayItem> {
	public WallyWalrusDisplayItemRenderer() {
		super(new WallyWalrusDisplayModel());
	}

	@Override
	public RenderType getRenderType(WallyWalrusDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
