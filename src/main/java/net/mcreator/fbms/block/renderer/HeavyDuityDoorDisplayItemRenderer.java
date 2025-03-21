package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HeavyDuityDoorDisplayModel;
import net.mcreator.fbms.block.display.HeavyDuityDoorDisplayItem;

public class HeavyDuityDoorDisplayItemRenderer extends GeoItemRenderer<HeavyDuityDoorDisplayItem> {
	public HeavyDuityDoorDisplayItemRenderer() {
		super(new HeavyDuityDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(HeavyDuityDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
