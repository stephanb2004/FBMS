package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox24OpenBlockModel;
import net.mcreator.fbms.block.entity.PizzaBox24OpenTileEntity;

public class PizzaBox24OpenTileRenderer extends GeoBlockRenderer<PizzaBox24OpenTileEntity> {
	public PizzaBox24OpenTileRenderer() {
		super(new PizzaBox24OpenBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox24OpenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
