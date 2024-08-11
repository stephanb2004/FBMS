package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MoltenFreddyDisplayModel;
import net.mcreator.fbms.block.display.MoltenFreddyDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MoltenFreddyDisplayItemRenderer extends GeoItemRenderer<MoltenFreddyDisplayItem> {
	public MoltenFreddyDisplayItemRenderer() {
		super(new MoltenFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(MoltenFreddyDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}