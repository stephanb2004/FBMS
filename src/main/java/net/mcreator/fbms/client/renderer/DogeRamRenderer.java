
package net.mcreator.fbms.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.entity.model.DogeRamModel;
import net.mcreator.fbms.entity.DogeRamEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DogeRamRenderer extends GeoEntityRenderer<DogeRamEntity> {
	public DogeRamRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DogeRamModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(DogeRamEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
