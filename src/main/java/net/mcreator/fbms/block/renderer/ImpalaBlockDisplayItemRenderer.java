package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ImpalaBlockDisplayModel;
import net.mcreator.fbms.block.display.ImpalaBlockDisplayItem;

public class ImpalaBlockDisplayItemRenderer extends GeoItemRenderer<ImpalaBlockDisplayItem> {
	public ImpalaBlockDisplayItemRenderer() {
		super(new ImpalaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ImpalaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
