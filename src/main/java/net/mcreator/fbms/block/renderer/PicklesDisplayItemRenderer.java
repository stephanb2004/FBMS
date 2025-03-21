package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PicklesDisplayModel;
import net.mcreator.fbms.block.display.PicklesDisplayItem;

public class PicklesDisplayItemRenderer extends GeoItemRenderer<PicklesDisplayItem> {
	public PicklesDisplayItemRenderer() {
		super(new PicklesDisplayModel());
	}

	@Override
	public RenderType getRenderType(PicklesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
