package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox87OpenBlockModel;
import net.mcreator.fbms.block.entity.PizzaBox87OpenTileEntity;

public class PizzaBox87OpenTileRenderer extends GeoBlockRenderer<PizzaBox87OpenTileEntity> {
	public PizzaBox87OpenTileRenderer() {
		super(new PizzaBox87OpenBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox87OpenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
