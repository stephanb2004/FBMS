package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MrCanDoDisplayModel;
import net.mcreator.fbms.block.display.MrCanDoDisplayItem;

public class MrCanDoDisplayItemRenderer extends GeoItemRenderer<MrCanDoDisplayItem> {
	public MrCanDoDisplayItemRenderer() {
		super(new MrCanDoDisplayModel());
	}

	@Override
	public RenderType getRenderType(MrCanDoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
