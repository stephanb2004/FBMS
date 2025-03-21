package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignSBTDisplayModel;
import net.mcreator.fbms.block.display.SignSBTDisplayItem;

public class SignSBTDisplayItemRenderer extends GeoItemRenderer<SignSBTDisplayItem> {
	public SignSBTDisplayItemRenderer() {
		super(new SignSBTDisplayModel());
	}

	@Override
	public RenderType getRenderType(SignSBTDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
