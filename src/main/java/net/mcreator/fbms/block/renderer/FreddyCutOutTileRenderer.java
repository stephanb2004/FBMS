package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FreddyCutOutBlockModel;
import net.mcreator.fbms.block.entity.FreddyCutOutTileEntity;

public class FreddyCutOutTileRenderer extends GeoBlockRenderer<FreddyCutOutTileEntity> {
	public FreddyCutOutTileRenderer() {
		super(new FreddyCutOutBlockModel());
	}

	@Override
	public RenderType getRenderType(FreddyCutOutTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
