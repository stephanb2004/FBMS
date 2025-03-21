package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ImpalaBlockBlockModel;
import net.mcreator.fbms.block.entity.ImpalaBlockTileEntity;

public class ImpalaBlockTileRenderer extends GeoBlockRenderer<ImpalaBlockTileEntity> {
	public ImpalaBlockTileRenderer() {
		super(new ImpalaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ImpalaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
