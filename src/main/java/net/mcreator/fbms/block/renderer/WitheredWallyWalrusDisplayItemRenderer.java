package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WitheredWallyWalrusDisplayModel;
import net.mcreator.fbms.block.display.WitheredWallyWalrusDisplayItem;

public class WitheredWallyWalrusDisplayItemRenderer extends GeoItemRenderer<WitheredWallyWalrusDisplayItem> {
	public WitheredWallyWalrusDisplayItemRenderer() {
		super(new WitheredWallyWalrusDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredWallyWalrusDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
