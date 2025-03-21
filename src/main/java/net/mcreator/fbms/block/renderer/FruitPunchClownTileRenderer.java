package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FruitPunchClownBlockModel;
import net.mcreator.fbms.block.entity.FruitPunchClownTileEntity;

public class FruitPunchClownTileRenderer extends GeoBlockRenderer<FruitPunchClownTileEntity> {
	public FruitPunchClownTileRenderer() {
		super(new FruitPunchClownBlockModel());
	}

	@Override
	public RenderType getRenderType(FruitPunchClownTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
