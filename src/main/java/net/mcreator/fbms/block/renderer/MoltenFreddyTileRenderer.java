package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MoltenFreddyBlockModel;
import net.mcreator.fbms.block.entity.MoltenFreddyTileEntity;

public class MoltenFreddyTileRenderer extends GeoBlockRenderer<MoltenFreddyTileEntity> {
	public MoltenFreddyTileRenderer() {
		super(new MoltenFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(MoltenFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
