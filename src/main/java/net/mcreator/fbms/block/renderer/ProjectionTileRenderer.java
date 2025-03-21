package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ProjectionBlockModel;
import net.mcreator.fbms.block.entity.ProjectionTileEntity;

public class ProjectionTileRenderer extends GeoBlockRenderer<ProjectionTileEntity> {
	public ProjectionTileRenderer() {
		super(new ProjectionBlockModel());
	}

	@Override
	public RenderType getRenderType(ProjectionTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
