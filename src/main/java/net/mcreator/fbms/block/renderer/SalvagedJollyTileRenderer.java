package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SalvagedJollyBlockModel;
import net.mcreator.fbms.block.entity.SalvagedJollyTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SalvagedJollyTileRenderer extends GeoBlockRenderer<SalvagedJollyTileEntity> {
	public SalvagedJollyTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new SalvagedJollyBlockModel());
	}

	@Override
	public RenderType getRenderType(SalvagedJollyTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
