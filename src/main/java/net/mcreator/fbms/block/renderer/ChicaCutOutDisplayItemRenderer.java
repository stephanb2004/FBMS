package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ChicaCutOutDisplayModel;
import net.mcreator.fbms.block.display.ChicaCutOutDisplayItem;

public class ChicaCutOutDisplayItemRenderer extends GeoItemRenderer<ChicaCutOutDisplayItem> {
	public ChicaCutOutDisplayItemRenderer() {
		super(new ChicaCutOutDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChicaCutOutDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
