package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MoldyRabbitBlockModel;
import net.mcreator.fbms.block.entity.MoldyRabbitTileEntity;

public class MoldyRabbitTileRenderer extends GeoBlockRenderer<MoldyRabbitTileEntity> {
	public MoldyRabbitTileRenderer() {
		super(new MoldyRabbitBlockModel());
	}

	@Override
	public RenderType getRenderType(MoldyRabbitTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
