package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Springbonnie01DisplayModel;
import net.mcreator.fbms.block.display.Springbonnie01DisplayItem;

public class Springbonnie01DisplayItemRenderer extends GeoItemRenderer<Springbonnie01DisplayItem> {
	public Springbonnie01DisplayItemRenderer() {
		super(new Springbonnie01DisplayModel());
	}

	@Override
	public RenderType getRenderType(Springbonnie01DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
