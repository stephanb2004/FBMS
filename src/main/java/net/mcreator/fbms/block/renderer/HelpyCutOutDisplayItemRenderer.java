package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HelpyCutOutDisplayModel;
import net.mcreator.fbms.block.display.HelpyCutOutDisplayItem;

public class HelpyCutOutDisplayItemRenderer extends GeoItemRenderer<HelpyCutOutDisplayItem> {
	public HelpyCutOutDisplayItemRenderer() {
		super(new HelpyCutOutDisplayModel());
	}

	@Override
	public RenderType getRenderType(HelpyCutOutDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
