package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarChicaBlockModel;
import net.mcreator.fbms.block.entity.RockStarChicaTileEntity;

public class RockStarChicaTileRenderer extends GeoBlockRenderer<RockStarChicaTileEntity> {
	public RockStarChicaTileRenderer() {
		super(new RockStarChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(RockStarChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
