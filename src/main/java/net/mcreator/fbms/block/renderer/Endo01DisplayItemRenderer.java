package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Endo01DisplayModel;
import net.mcreator.fbms.block.display.Endo01DisplayItem;

public class Endo01DisplayItemRenderer extends GeoItemRenderer<Endo01DisplayItem> {
	public Endo01DisplayItemRenderer() {
		super(new Endo01DisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
