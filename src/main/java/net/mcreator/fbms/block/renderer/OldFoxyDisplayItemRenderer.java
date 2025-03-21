package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldFoxyDisplayModel;
import net.mcreator.fbms.block.display.OldFoxyDisplayItem;

public class OldFoxyDisplayItemRenderer extends GeoItemRenderer<OldFoxyDisplayItem> {
	public OldFoxyDisplayItemRenderer() {
		super(new OldFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(OldFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
