package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DiscountCoolingUnitBlockModel;
import net.mcreator.fbms.block.entity.DiscountCoolingUnitTileEntity;

public class DiscountCoolingUnitTileRenderer extends GeoBlockRenderer<DiscountCoolingUnitTileEntity> {
	public DiscountCoolingUnitTileRenderer() {
		super(new DiscountCoolingUnitBlockModel());
	}

	@Override
	public RenderType getRenderType(DiscountCoolingUnitTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
