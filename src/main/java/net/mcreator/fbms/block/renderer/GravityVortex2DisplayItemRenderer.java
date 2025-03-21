package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GravityVortex2DisplayModel;
import net.mcreator.fbms.block.display.GravityVortex2DisplayItem;

public class GravityVortex2DisplayItemRenderer extends GeoItemRenderer<GravityVortex2DisplayItem> {
	public GravityVortex2DisplayItemRenderer() {
		super(new GravityVortex2DisplayModel());
	}

	@Override
	public RenderType getRenderType(GravityVortex2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
