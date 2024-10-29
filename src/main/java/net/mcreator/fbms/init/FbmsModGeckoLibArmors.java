package net.mcreator.fbms.init;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fbms.item.GasMaskItem;
import net.mcreator.fbms.client.renderer.GasMaskArmorRenderer;
import net.mcreator.fbms.FbmsMod;

@Mod.EventBusSubscriber(modid = FbmsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FbmsModGeckoLibArmors {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.AddLayers event) {
		GeoArmorRenderer.registerArmorRenderer(GasMaskItem.class, () -> new GasMaskArmorRenderer());
	}
}
