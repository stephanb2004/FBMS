package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FreddyCutOutDisplayModel;
import net.mcreator.fbms.block.display.FreddyCutOutDisplayItem;

public class FreddyCutOutDisplayItemRenderer extends GeoItemRenderer<FreddyCutOutDisplayItem> {
	public FreddyCutOutDisplayItemRenderer() {
		super(new FreddyCutOutDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddyCutOutDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
