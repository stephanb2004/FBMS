package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarFreddyDisplayModel;
import net.mcreator.fbms.block.display.RockStarFreddyDisplayItem;

public class RockStarFreddyDisplayItemRenderer extends GeoItemRenderer<RockStarFreddyDisplayItem> {
	public RockStarFreddyDisplayItemRenderer() {
		super(new RockStarFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockStarFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
