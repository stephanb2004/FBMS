package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.JollyTheRatAnimatedBlockModel;
import net.mcreator.fbms.block.entity.JollyTheRatAnimatedTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JollyTheRatAnimatedTileRenderer extends GeoBlockRenderer<JollyTheRatAnimatedTileEntity> {
	public JollyTheRatAnimatedTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new JollyTheRatAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(JollyTheRatAnimatedTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
