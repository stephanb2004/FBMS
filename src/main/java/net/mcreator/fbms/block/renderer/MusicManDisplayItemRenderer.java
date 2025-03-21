package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MusicManDisplayModel;
import net.mcreator.fbms.block.display.MusicManDisplayItem;

public class MusicManDisplayItemRenderer extends GeoItemRenderer<MusicManDisplayItem> {
	public MusicManDisplayItemRenderer() {
		super(new MusicManDisplayModel());
	}

	@Override
	public RenderType getRenderType(MusicManDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
