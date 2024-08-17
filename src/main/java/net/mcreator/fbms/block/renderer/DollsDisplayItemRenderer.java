package net.mcreator.fbms.block.renderer;

public class DollsDisplayItemRenderer extends GeoItemRenderer<DollsDisplayItem> {
	public DollsDisplayItemRenderer() {
		super(new DollsDisplayModel());
	}

	@Override
	public RenderType getRenderType(DollsDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}