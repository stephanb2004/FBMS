package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignRFADisplayModel;
import net.mcreator.fbms.block.display.SignRFADisplayItem;

public class SignRFADisplayItemRenderer extends GeoItemRenderer<SignRFADisplayItem> {
	public SignRFADisplayItemRenderer() {
		super(new SignRFADisplayModel());
	}

	@Override
	public RenderType getRenderType(SignRFADisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
