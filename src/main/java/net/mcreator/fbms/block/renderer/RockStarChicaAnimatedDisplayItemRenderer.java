package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarChicaAnimatedDisplayModel;
import net.mcreator.fbms.block.display.RockStarChicaAnimatedDisplayItem;

public class RockStarChicaAnimatedDisplayItemRenderer extends GeoItemRenderer<RockStarChicaAnimatedDisplayItem> {
	public RockStarChicaAnimatedDisplayItemRenderer() {
		super(new RockStarChicaAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockStarChicaAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
