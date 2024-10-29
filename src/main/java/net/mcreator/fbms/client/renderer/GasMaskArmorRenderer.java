package net.mcreator.fbms.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.item.model.GasMaskModel;
import net.mcreator.fbms.item.GasMaskItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GasMaskArmorRenderer extends GeoArmorRenderer<GasMaskItem> {
	public GasMaskArmorRenderer() {
		super(new GasMaskModel());
		this.headBone = "bipedHead";
		this.bodyBone = "armorBody";
		this.rightArmBone = "armorRightArm";
		this.leftArmBone = "armorLeftArm";
		this.rightLegBone = "armorRightLeg";
		this.leftLegBone = "armorLeftLeg";
		this.rightBootBone = "armorRightBoot";
		this.leftBootBone = "armorLeftBoot";
	}

	@Override
	public RenderType getRenderType(GasMaskItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
