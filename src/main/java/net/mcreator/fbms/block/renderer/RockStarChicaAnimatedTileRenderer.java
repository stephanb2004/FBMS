package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarChicaAnimatedBlockModel;
import net.mcreator.fbms.block.entity.RockStarChicaAnimatedTileEntity;

public class RockStarChicaAnimatedTileRenderer extends GeoBlockRenderer<RockStarChicaAnimatedTileEntity> {
	public RockStarChicaAnimatedTileRenderer() {
		super(new RockStarChicaAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(RockStarChicaAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
