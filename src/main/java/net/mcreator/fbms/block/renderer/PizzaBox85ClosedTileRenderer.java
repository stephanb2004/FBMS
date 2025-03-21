package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox85ClosedBlockModel;
import net.mcreator.fbms.block.entity.PizzaBox85ClosedTileEntity;

public class PizzaBox85ClosedTileRenderer extends GeoBlockRenderer<PizzaBox85ClosedTileEntity> {
	public PizzaBox85ClosedTileRenderer() {
		super(new PizzaBox85ClosedBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox85ClosedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
