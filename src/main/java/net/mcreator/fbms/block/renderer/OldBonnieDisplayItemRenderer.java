package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldBonnieDisplayModel;
import net.mcreator.fbms.block.display.OldBonnieDisplayItem;

public class OldBonnieDisplayItemRenderer extends GeoItemRenderer<OldBonnieDisplayItem> {
	public OldBonnieDisplayItemRenderer() {
		super(new OldBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(OldBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
