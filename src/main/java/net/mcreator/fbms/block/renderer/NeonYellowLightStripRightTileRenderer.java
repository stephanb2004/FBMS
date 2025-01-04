package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripRightBlockModel;
import net.mcreator.fbms.block.entity.NeonYellowLightStripRightTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NeonYellowLightStripRightTileRenderer extends GeoBlockRenderer<NeonYellowLightStripRightTileEntity> {
	public NeonYellowLightStripRightTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new NeonYellowLightStripRightBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripRightTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
