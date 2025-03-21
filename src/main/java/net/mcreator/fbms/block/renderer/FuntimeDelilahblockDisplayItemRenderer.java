package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FuntimeDelilahblockDisplayModel;
import net.mcreator.fbms.block.display.FuntimeDelilahblockDisplayItem;

public class FuntimeDelilahblockDisplayItemRenderer extends GeoItemRenderer<FuntimeDelilahblockDisplayItem> {
	public FuntimeDelilahblockDisplayItemRenderer() {
		super(new FuntimeDelilahblockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FuntimeDelilahblockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
