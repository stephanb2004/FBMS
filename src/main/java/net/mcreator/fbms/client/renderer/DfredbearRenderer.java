
package net.mcreator.fbms.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.entity.model.DfredbearModel;
import net.mcreator.fbms.entity.DfredbearEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DfredbearRenderer extends GeoEntityRenderer<DfredbearEntity> {
	public DfredbearRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DfredbearModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(DfredbearEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
