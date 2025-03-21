package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Endo02DisplayModel;
import net.mcreator.fbms.block.display.Endo02DisplayItem;

public class Endo02DisplayItemRenderer extends GeoItemRenderer<Endo02DisplayItem> {
	public Endo02DisplayItemRenderer() {
		super(new Endo02DisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
