package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ProjectorBlockModel;
import net.mcreator.fbms.block.entity.ProjectorTileEntity;

public class ProjectorTileRenderer extends GeoBlockRenderer<ProjectorTileEntity> {
	public ProjectorTileRenderer() {
		super(new ProjectorBlockModel());
	}

	@Override
	public RenderType getRenderType(ProjectorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
