package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignMSDisplayModel;
import net.mcreator.fbms.block.display.SignMSDisplayItem;

public class SignMSDisplayItemRenderer extends GeoItemRenderer<SignMSDisplayItem> {
	public SignMSDisplayItemRenderer() {
		super(new SignMSDisplayModel());
	}

	@Override
	public RenderType getRenderType(SignMSDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
