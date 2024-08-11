package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DrTeathDisplayModel;
import net.mcreator.fbms.block.display.DrTeathDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DrTeathDisplayItemRenderer extends GeoItemRenderer<DrTeathDisplayItem> {
	public DrTeathDisplayItemRenderer() {
		super(new DrTeathDisplayModel());
	}

	@Override
	public RenderType getRenderType(DrTeathDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
