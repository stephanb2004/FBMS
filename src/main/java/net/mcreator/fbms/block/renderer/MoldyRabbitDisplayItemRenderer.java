package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MoldyRabbitDisplayModel;
import net.mcreator.fbms.block.display.MoldyRabbitDisplayItem;

public class MoldyRabbitDisplayItemRenderer extends GeoItemRenderer<MoldyRabbitDisplayItem> {
	public MoldyRabbitDisplayItemRenderer() {
		super(new MoldyRabbitDisplayModel());
	}

	@Override
	public RenderType getRenderType(MoldyRabbitDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
