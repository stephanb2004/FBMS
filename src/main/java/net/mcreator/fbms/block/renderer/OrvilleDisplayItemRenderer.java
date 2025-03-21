package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OrvilleDisplayModel;
import net.mcreator.fbms.block.display.OrvilleDisplayItem;

public class OrvilleDisplayItemRenderer extends GeoItemRenderer<OrvilleDisplayItem> {
	public OrvilleDisplayItemRenderer() {
		super(new OrvilleDisplayModel());
	}

	@Override
	public RenderType getRenderType(OrvilleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
