package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Megaultimatespeakertron3000DisplayModel;
import net.mcreator.fbms.block.display.Megaultimatespeakertron3000DisplayItem;

public class Megaultimatespeakertron3000DisplayItemRenderer extends GeoItemRenderer<Megaultimatespeakertron3000DisplayItem> {
	public Megaultimatespeakertron3000DisplayItemRenderer() {
		super(new Megaultimatespeakertron3000DisplayModel());
	}

	@Override
	public RenderType getRenderType(Megaultimatespeakertron3000DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
