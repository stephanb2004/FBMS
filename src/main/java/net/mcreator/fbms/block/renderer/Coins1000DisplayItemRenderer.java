package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins1000DisplayModel;
import net.mcreator.fbms.block.display.Coins1000DisplayItem;

public class Coins1000DisplayItemRenderer extends GeoItemRenderer<Coins1000DisplayItem> {
	public Coins1000DisplayItemRenderer() {
		super(new Coins1000DisplayModel());
	}

	@Override
	public RenderType getRenderType(Coins1000DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
