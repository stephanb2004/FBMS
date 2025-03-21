package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox93OpenBlockModel;
import net.mcreator.fbms.block.entity.PizzaBox93OpenTileEntity;

public class PizzaBox93OpenTileRenderer extends GeoBlockRenderer<PizzaBox93OpenTileEntity> {
	public PizzaBox93OpenTileRenderer() {
		super(new PizzaBox93OpenBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox93OpenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
