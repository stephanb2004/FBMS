package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RockStarFoxyBlockModel;
import net.mcreator.fbms.block.entity.RockStarFoxyTileEntity;

public class RockStarFoxyTileRenderer extends GeoBlockRenderer<RockStarFoxyTileEntity> {
	public RockStarFoxyTileRenderer() {
		super(new RockStarFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(RockStarFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
