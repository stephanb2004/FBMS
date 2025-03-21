package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonnieDisplayModel;
import net.mcreator.fbms.block.display.BonnieDisplayItem;

public class BonnieDisplayItemRenderer extends GeoItemRenderer<BonnieDisplayItem> {
	public BonnieDisplayItemRenderer() {
		super(new BonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
