package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarFreddyAnimatedBlockModel;
import net.mcreator.fbms.block.entity.RockStarFreddyAnimatedTileEntity;

public class RockStarFreddyAnimatedTileRenderer extends GeoBlockRenderer<RockStarFreddyAnimatedTileEntity> {
	public RockStarFreddyAnimatedTileRenderer() {
		super(new RockStarFreddyAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(RockStarFreddyAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
