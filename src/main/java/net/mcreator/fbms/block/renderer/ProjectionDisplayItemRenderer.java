package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ProjectionDisplayModel;
import net.mcreator.fbms.block.display.ProjectionDisplayItem;

public class ProjectionDisplayItemRenderer extends GeoItemRenderer<ProjectionDisplayItem> {
	public ProjectionDisplayItemRenderer() {
		super(new ProjectionDisplayModel());
	}

	@Override
	public RenderType getRenderType(ProjectionDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
