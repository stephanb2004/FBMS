package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FunTimeChicaDisplayModel;
import net.mcreator.fbms.block.display.FunTimeChicaDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FunTimeChicaDisplayItemRenderer extends GeoItemRenderer<FunTimeChicaDisplayItem> {
	public FunTimeChicaDisplayItemRenderer() {
		super(new FunTimeChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(FunTimeChicaDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
