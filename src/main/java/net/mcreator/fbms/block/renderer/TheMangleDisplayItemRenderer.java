package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.TheMangleDisplayModel;
import net.mcreator.fbms.block.display.TheMangleDisplayItem;

public class TheMangleDisplayItemRenderer extends GeoItemRenderer<TheMangleDisplayItem> {
	public TheMangleDisplayItemRenderer() {
		super(new TheMangleDisplayModel());
	}

	@Override
	public RenderType getRenderType(TheMangleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
