package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BucketBobDisplayModel;
import net.mcreator.fbms.block.display.BucketBobDisplayItem;

public class BucketBobDisplayItemRenderer extends GeoItemRenderer<BucketBobDisplayItem> {
	public BucketBobDisplayItemRenderer() {
		super(new BucketBobDisplayModel());
	}

	@Override
	public RenderType getRenderType(BucketBobDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
