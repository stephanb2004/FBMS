package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MrHippoDisplayModel;
import net.mcreator.fbms.block.display.MrHippoDisplayItem;

public class MrHippoDisplayItemRenderer extends GeoItemRenderer<MrHippoDisplayItem> {
	public MrHippoDisplayItemRenderer() {
		super(new MrHippoDisplayModel());
	}

	@Override
	public RenderType getRenderType(MrHippoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
