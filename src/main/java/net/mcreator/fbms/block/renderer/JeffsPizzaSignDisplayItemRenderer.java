package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.JeffsPizzaSignDisplayModel;
import net.mcreator.fbms.block.display.JeffsPizzaSignDisplayItem;

public class JeffsPizzaSignDisplayItemRenderer extends GeoItemRenderer<JeffsPizzaSignDisplayItem> {
	public JeffsPizzaSignDisplayItemRenderer() {
		super(new JeffsPizzaSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(JeffsPizzaSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
