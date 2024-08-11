package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OrvilleDisplayModel;
import net.mcreator.fbms.block.display.OrvilleDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OrvilleDisplayItemRenderer extends GeoItemRenderer<OrvilleDisplayItem> {
	public OrvilleDisplayItemRenderer() {
		super(new OrvilleDisplayModel());
	}

	@Override
	public RenderType getRenderType(OrvilleDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
