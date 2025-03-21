package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PCDisplayModel;
import net.mcreator.fbms.block.display.PCDisplayItem;

public class PCDisplayItemRenderer extends GeoItemRenderer<PCDisplayItem> {
	public PCDisplayItemRenderer() {
		super(new PCDisplayModel());
	}

	@Override
	public RenderType getRenderType(PCDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
