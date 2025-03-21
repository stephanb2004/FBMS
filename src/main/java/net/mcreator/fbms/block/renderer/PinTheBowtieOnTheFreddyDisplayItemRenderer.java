package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PinTheBowtieOnTheFreddyDisplayModel;
import net.mcreator.fbms.block.display.PinTheBowtieOnTheFreddyDisplayItem;

public class PinTheBowtieOnTheFreddyDisplayItemRenderer extends GeoItemRenderer<PinTheBowtieOnTheFreddyDisplayItem> {
	public PinTheBowtieOnTheFreddyDisplayItemRenderer() {
		super(new PinTheBowtieOnTheFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieOnTheFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
