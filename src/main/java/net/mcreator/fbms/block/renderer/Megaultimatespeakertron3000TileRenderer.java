package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Megaultimatespeakertron3000BlockModel;
import net.mcreator.fbms.block.entity.Megaultimatespeakertron3000TileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Megaultimatespeakertron3000TileRenderer extends GeoBlockRenderer<Megaultimatespeakertron3000TileEntity> {
	public Megaultimatespeakertron3000TileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new Megaultimatespeakertron3000BlockModel());
	}

	@Override
	public RenderType getRenderType(Megaultimatespeakertron3000TileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
