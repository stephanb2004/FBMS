package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SalvagedJollyBlockModel;
import net.mcreator.fbms.block.entity.SalvagedJollyTileEntity;

public class SalvagedJollyTileRenderer extends GeoBlockRenderer<SalvagedJollyTileEntity> {
	public SalvagedJollyTileRenderer() {
		super(new SalvagedJollyBlockModel());
	}

	@Override
	public RenderType getRenderType(SalvagedJollyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
