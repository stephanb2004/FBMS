package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins100DisplayModel;
import net.mcreator.fbms.block.display.Coins100DisplayItem;

public class Coins100DisplayItemRenderer extends GeoItemRenderer<Coins100DisplayItem> {
	public Coins100DisplayItemRenderer() {
		super(new Coins100DisplayModel());
	}

	@Override
	public RenderType getRenderType(Coins100DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
