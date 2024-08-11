package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DiscountCoolingUnitDisplayModel;
import net.mcreator.fbms.block.display.DiscountCoolingUnitDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DiscountCoolingUnitDisplayItemRenderer extends GeoItemRenderer<DiscountCoolingUnitDisplayItem> {
	public DiscountCoolingUnitDisplayItemRenderer() {
		super(new DiscountCoolingUnitDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiscountCoolingUnitDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}