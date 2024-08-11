package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GravityVortex2DisplayModel;
import net.mcreator.fbms.block.display.GravityVortex2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GravityVortex2DisplayItemRenderer extends GeoItemRenderer<GravityVortex2DisplayItem> {
	public GravityVortex2DisplayItemRenderer() {
		super(new GravityVortex2DisplayModel());
	}

	@Override
	public RenderType getRenderType(GravityVortex2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
