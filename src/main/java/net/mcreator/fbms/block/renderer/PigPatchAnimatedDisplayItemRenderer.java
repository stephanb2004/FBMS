package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PigPatchAnimatedDisplayModel;
import net.mcreator.fbms.block.display.PigPatchAnimatedDisplayItem;

public class PigPatchAnimatedDisplayItemRenderer extends GeoItemRenderer<PigPatchAnimatedDisplayItem> {
	public PigPatchAnimatedDisplayItemRenderer() {
		super(new PigPatchAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PigPatchAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
