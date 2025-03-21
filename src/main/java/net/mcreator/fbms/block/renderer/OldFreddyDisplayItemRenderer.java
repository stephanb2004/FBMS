package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldFreddyDisplayModel;
import net.mcreator.fbms.block.display.OldFreddyDisplayItem;

public class OldFreddyDisplayItemRenderer extends GeoItemRenderer<OldFreddyDisplayItem> {
	public OldFreddyDisplayItemRenderer() {
		super(new OldFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(OldFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
