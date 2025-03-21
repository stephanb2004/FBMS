package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarFoxyAnimatedDisplayModel;
import net.mcreator.fbms.block.display.RockStarFoxyAnimatedDisplayItem;

public class RockStarFoxyAnimatedDisplayItemRenderer extends GeoItemRenderer<RockStarFoxyAnimatedDisplayItem> {
	public RockStarFoxyAnimatedDisplayItemRenderer() {
		super(new RockStarFoxyAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockStarFoxyAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
