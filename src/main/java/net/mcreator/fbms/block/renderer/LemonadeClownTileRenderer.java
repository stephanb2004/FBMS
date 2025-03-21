package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LemonadeClownBlockModel;
import net.mcreator.fbms.block.entity.LemonadeClownTileEntity;

public class LemonadeClownTileRenderer extends GeoBlockRenderer<LemonadeClownTileEntity> {
	public LemonadeClownTileRenderer() {
		super(new LemonadeClownBlockModel());
	}

	@Override
	public RenderType getRenderType(LemonadeClownTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
