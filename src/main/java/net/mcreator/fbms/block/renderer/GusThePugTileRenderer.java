package net.mcreator.fbms.block.renderer;

public class GusThePugTileRenderer extends GeoBlockRenderer<GusThePugTileEntity> {
	public GusThePugTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new GusThePugBlockModel());
	}

	@Override
	public RenderType getRenderType(GusThePugTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}