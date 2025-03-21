package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FtFreddyDisplayModel;
import net.mcreator.fbms.block.display.FtFreddyDisplayItem;

public class FtFreddyDisplayItemRenderer extends GeoItemRenderer<FtFreddyDisplayItem> {
	public FtFreddyDisplayItemRenderer() {
		super(new FtFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(FtFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
