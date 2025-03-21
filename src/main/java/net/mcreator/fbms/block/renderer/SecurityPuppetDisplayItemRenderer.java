package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SecurityPuppetDisplayModel;
import net.mcreator.fbms.block.display.SecurityPuppetDisplayItem;

public class SecurityPuppetDisplayItemRenderer extends GeoItemRenderer<SecurityPuppetDisplayItem> {
	public SecurityPuppetDisplayItemRenderer() {
		super(new SecurityPuppetDisplayModel());
	}

	@Override
	public RenderType getRenderType(SecurityPuppetDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
