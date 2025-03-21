package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MrHippoAnimatedDisplayModel;
import net.mcreator.fbms.block.display.MrHippoAnimatedDisplayItem;

public class MrHippoAnimatedDisplayItemRenderer extends GeoItemRenderer<MrHippoAnimatedDisplayItem> {
	public MrHippoAnimatedDisplayItemRenderer() {
		super(new MrHippoAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(MrHippoAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
