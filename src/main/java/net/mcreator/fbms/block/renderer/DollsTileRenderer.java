package net.mcreator.fbms.block.renderer;

public class DollsTileRenderer extends GeoBlockRenderer<DollsTileEntity> {
	public DollsTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new DollsBlockModel());
	}

	@Override
	public RenderType getRenderType(DollsTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}