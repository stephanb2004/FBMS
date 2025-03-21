package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OrvilleAnimatedDisplayModel;
import net.mcreator.fbms.block.display.OrvilleAnimatedDisplayItem;

public class OrvilleAnimatedDisplayItemRenderer extends GeoItemRenderer<OrvilleAnimatedDisplayItem> {
	public OrvilleAnimatedDisplayItemRenderer() {
		super(new OrvilleAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(OrvilleAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
