package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RidingRocketsPurpleBlockModel;
import net.mcreator.fbms.block.entity.RidingRocketsPurpleTileEntity;

public class RidingRocketsPurpleTileRenderer extends GeoBlockRenderer<RidingRocketsPurpleTileEntity> {
	public RidingRocketsPurpleTileRenderer() {
		super(new RidingRocketsPurpleBlockModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketsPurpleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
