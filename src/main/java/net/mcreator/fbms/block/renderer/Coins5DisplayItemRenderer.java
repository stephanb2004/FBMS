package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins5DisplayModel;
import net.mcreator.fbms.block.display.Coins5DisplayItem;

public class Coins5DisplayItemRenderer extends GeoItemRenderer<Coins5DisplayItem> {
	public Coins5DisplayItemRenderer() {
		super(new Coins5DisplayModel());
	}

	@Override
	public RenderType getRenderType(Coins5DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
