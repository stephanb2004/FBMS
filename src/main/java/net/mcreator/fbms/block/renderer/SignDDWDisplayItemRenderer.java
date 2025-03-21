package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignDDWDisplayModel;
import net.mcreator.fbms.block.display.SignDDWDisplayItem;

public class SignDDWDisplayItemRenderer extends GeoItemRenderer<SignDDWDisplayItem> {
	public SignDDWDisplayItemRenderer() {
		super(new SignDDWDisplayModel());
	}

	@Override
	public RenderType getRenderType(SignDDWDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
