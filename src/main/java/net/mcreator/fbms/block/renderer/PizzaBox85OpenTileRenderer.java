package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox85OpenBlockModel;
import net.mcreator.fbms.block.entity.PizzaBox85OpenTileEntity;

public class PizzaBox85OpenTileRenderer extends GeoBlockRenderer<PizzaBox85OpenTileEntity> {
	public PizzaBox85OpenTileRenderer() {
		super(new PizzaBox85OpenBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox85OpenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
