package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Megaultimatespeakertron3000BlockModel;
import net.mcreator.fbms.block.entity.Megaultimatespeakertron3000TileEntity;

public class Megaultimatespeakertron3000TileRenderer extends GeoBlockRenderer<Megaultimatespeakertron3000TileEntity> {
	public Megaultimatespeakertron3000TileRenderer() {
		super(new Megaultimatespeakertron3000BlockModel());
	}

	@Override
	public RenderType getRenderType(Megaultimatespeakertron3000TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
