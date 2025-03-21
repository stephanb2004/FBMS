package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PinTheBowtieOnTheTieTheToyFreddyDisplayModel;
import net.mcreator.fbms.block.display.PinTheBowtieOnTheTieTheToyFreddyDisplayItem;

public class PinTheBowtieOnTheTieTheToyFreddyDisplayItemRenderer extends GeoItemRenderer<PinTheBowtieOnTheTieTheToyFreddyDisplayItem> {
	public PinTheBowtieOnTheTieTheToyFreddyDisplayItemRenderer() {
		super(new PinTheBowtieOnTheTieTheToyFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieOnTheTieTheToyFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
