package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarBonnieDisplayModel;
import net.mcreator.fbms.block.display.RockStarBonnieDisplayItem;

public class RockStarBonnieDisplayItemRenderer extends GeoItemRenderer<RockStarBonnieDisplayItem> {
	public RockStarBonnieDisplayItemRenderer() {
		super(new RockStarBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockStarBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
