package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarBonnieAnimatedBlockModel;
import net.mcreator.fbms.block.entity.RockStarBonnieAnimatedTileEntity;

public class RockStarBonnieAnimatedTileRenderer extends GeoBlockRenderer<RockStarBonnieAnimatedTileEntity> {
	public RockStarBonnieAnimatedTileRenderer() {
		super(new RockStarBonnieAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(RockStarBonnieAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
