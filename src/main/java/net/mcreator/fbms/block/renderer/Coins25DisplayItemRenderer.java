package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins25DisplayModel;
import net.mcreator.fbms.block.display.Coins25DisplayItem;

public class Coins25DisplayItemRenderer extends GeoItemRenderer<Coins25DisplayItem> {
	public Coins25DisplayItemRenderer() {
		super(new Coins25DisplayModel());
	}

	@Override
	public RenderType getRenderType(Coins25DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
