package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaPlaceSignBlockModel;
import net.mcreator.fbms.block.entity.PizzaPlaceSignTileEntity;

public class PizzaPlaceSignTileRenderer extends GeoBlockRenderer<PizzaPlaceSignTileEntity> {
	public PizzaPlaceSignTileRenderer() {
		super(new PizzaPlaceSignBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaPlaceSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
