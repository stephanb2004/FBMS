package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarFoxyAnimatedBlockModel;
import net.mcreator.fbms.block.entity.RockStarFoxyAnimatedTileEntity;

public class RockStarFoxyAnimatedTileRenderer extends GeoBlockRenderer<RockStarFoxyAnimatedTileEntity> {
	public RockStarFoxyAnimatedTileRenderer() {
		super(new RockStarFoxyAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(RockStarFoxyAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
