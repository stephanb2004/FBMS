package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Springbonnie01BlockModel;
import net.mcreator.fbms.block.entity.Springbonnie01TileEntity;

public class Springbonnie01TileRenderer extends GeoBlockRenderer<Springbonnie01TileEntity> {
	public Springbonnie01TileRenderer() {
		super(new Springbonnie01BlockModel());
	}

	@Override
	public RenderType getRenderType(Springbonnie01TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
