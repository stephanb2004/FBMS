package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Springbonnie01AnimatedBlockModel;
import net.mcreator.fbms.block.entity.Springbonnie01AnimatedTileEntity;

public class Springbonnie01AnimatedTileRenderer extends GeoBlockRenderer<Springbonnie01AnimatedTileEntity> {
	public Springbonnie01AnimatedTileRenderer() {
		super(new Springbonnie01AnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(Springbonnie01AnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
