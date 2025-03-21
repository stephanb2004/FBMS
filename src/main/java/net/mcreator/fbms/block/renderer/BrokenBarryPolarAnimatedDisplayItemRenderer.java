package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BrokenBarryPolarAnimatedDisplayModel;
import net.mcreator.fbms.block.display.BrokenBarryPolarAnimatedDisplayItem;

public class BrokenBarryPolarAnimatedDisplayItemRenderer extends GeoItemRenderer<BrokenBarryPolarAnimatedDisplayItem> {
	public BrokenBarryPolarAnimatedDisplayItemRenderer() {
		super(new BrokenBarryPolarAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(BrokenBarryPolarAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
