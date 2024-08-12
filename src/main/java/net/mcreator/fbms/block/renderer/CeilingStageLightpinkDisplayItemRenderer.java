package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightpinkDisplayModel;
import net.mcreator.fbms.block.display.CeilingStageLightpinkDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CeilingStageLightpinkDisplayItemRenderer extends GeoItemRenderer<CeilingStageLightpinkDisplayItem> {
	public CeilingStageLightpinkDisplayItemRenderer() {
		super(new CeilingStageLightpinkDisplayModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightpinkDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}