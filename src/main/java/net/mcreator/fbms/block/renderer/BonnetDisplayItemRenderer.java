package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonnetDisplayModel;
import net.mcreator.fbms.block.display.BonnetDisplayItem;

public class BonnetDisplayItemRenderer extends GeoItemRenderer<BonnetDisplayItem> {
	public BonnetDisplayItemRenderer() {
		super(new BonnetDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonnetDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
