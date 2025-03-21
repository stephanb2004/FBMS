package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignSNSDisplayModel;
import net.mcreator.fbms.block.display.SignSNSDisplayItem;

public class SignSNSDisplayItemRenderer extends GeoItemRenderer<SignSNSDisplayItem> {
	public SignSNSDisplayItemRenderer() {
		super(new SignSNSDisplayModel());
	}

	@Override
	public RenderType getRenderType(SignSNSDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
