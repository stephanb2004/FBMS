package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RidingRocketsPurpleDisplayModel;
import net.mcreator.fbms.block.display.RidingRocketsPurpleDisplayItem;

public class RidingRocketsPurpleDisplayItemRenderer extends GeoItemRenderer<RidingRocketsPurpleDisplayItem> {
	public RidingRocketsPurpleDisplayItemRenderer() {
		super(new RidingRocketsPurpleDisplayModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketsPurpleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
