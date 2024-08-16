package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FrightsSign2DisplayModel;
import net.mcreator.fbms.block.display.FrightsSign2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FrightsSign2DisplayItemRenderer extends GeoItemRenderer<FrightsSign2DisplayItem> {
	public FrightsSign2DisplayItemRenderer() {
		super(new FrightsSign2DisplayModel());
	}

	@Override
	public RenderType getRenderType(FrightsSign2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}