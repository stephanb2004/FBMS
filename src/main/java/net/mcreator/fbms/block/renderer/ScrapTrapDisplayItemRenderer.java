package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ScrapTrapDisplayModel;
import net.mcreator.fbms.block.display.ScrapTrapDisplayItem;

public class ScrapTrapDisplayItemRenderer extends GeoItemRenderer<ScrapTrapDisplayItem> {
	public ScrapTrapDisplayItemRenderer() {
		super(new ScrapTrapDisplayModel());
	}

	@Override
	public RenderType getRenderType(ScrapTrapDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
