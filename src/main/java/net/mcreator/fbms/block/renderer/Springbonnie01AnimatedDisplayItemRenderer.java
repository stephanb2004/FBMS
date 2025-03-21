package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Springbonnie01AnimatedDisplayModel;
import net.mcreator.fbms.block.display.Springbonnie01AnimatedDisplayItem;

public class Springbonnie01AnimatedDisplayItemRenderer extends GeoItemRenderer<Springbonnie01AnimatedDisplayItem> {
	public Springbonnie01AnimatedDisplayItemRenderer() {
		super(new Springbonnie01AnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(Springbonnie01AnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
