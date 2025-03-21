package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BrokenFreddyDisplayModel;
import net.mcreator.fbms.block.display.BrokenFreddyDisplayItem;

public class BrokenFreddyDisplayItemRenderer extends GeoItemRenderer<BrokenFreddyDisplayItem> {
	public BrokenFreddyDisplayItemRenderer() {
		super(new BrokenFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(BrokenFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
