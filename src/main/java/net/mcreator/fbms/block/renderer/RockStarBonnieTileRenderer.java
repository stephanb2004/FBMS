package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarBonnieBlockModel;
import net.mcreator.fbms.block.entity.RockStarBonnieTileEntity;

public class RockStarBonnieTileRenderer extends GeoBlockRenderer<RockStarBonnieTileEntity> {
	public RockStarBonnieTileRenderer() {
		super(new RockStarBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(RockStarBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
