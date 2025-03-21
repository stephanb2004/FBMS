package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PigPatchDisplayModel;
import net.mcreator.fbms.block.display.PigPatchDisplayItem;

public class PigPatchDisplayItemRenderer extends GeoItemRenderer<PigPatchDisplayItem> {
	public PigPatchDisplayItemRenderer() {
		super(new PigPatchDisplayModel());
	}

	@Override
	public RenderType getRenderType(PigPatchDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
