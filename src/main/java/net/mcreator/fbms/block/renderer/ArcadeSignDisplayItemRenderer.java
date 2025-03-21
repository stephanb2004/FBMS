package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ArcadeSignDisplayModel;
import net.mcreator.fbms.block.display.ArcadeSignDisplayItem;

public class ArcadeSignDisplayItemRenderer extends GeoItemRenderer<ArcadeSignDisplayItem> {
	public ArcadeSignDisplayItemRenderer() {
		super(new ArcadeSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
