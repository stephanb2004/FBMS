package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PuppetBoxDisplayModel;
import net.mcreator.fbms.block.display.PuppetBoxDisplayItem;

public class PuppetBoxDisplayItemRenderer extends GeoItemRenderer<PuppetBoxDisplayItem> {
	public PuppetBoxDisplayItemRenderer() {
		super(new PuppetBoxDisplayModel());
	}

	@Override
	public RenderType getRenderType(PuppetBoxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
