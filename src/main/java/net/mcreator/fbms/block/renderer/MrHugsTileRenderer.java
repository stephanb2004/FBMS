package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MrHugsBlockModel;
import net.mcreator.fbms.block.entity.MrHugsTileEntity;

public class MrHugsTileRenderer extends GeoBlockRenderer<MrHugsTileEntity> {
	public MrHugsTileRenderer() {
		super(new MrHugsBlockModel());
	}

	@Override
	public RenderType getRenderType(MrHugsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
