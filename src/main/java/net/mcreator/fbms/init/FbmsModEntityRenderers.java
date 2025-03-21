
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fbms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fbms.client.renderer.StationWagonRenderer;
import net.mcreator.fbms.client.renderer.SeatRenderer;
import net.mcreator.fbms.client.renderer.RatRenderer;
import net.mcreator.fbms.client.renderer.MysteriousGiantScuttlersRenderer;
import net.mcreator.fbms.client.renderer.ImpalaRenderer;
import net.mcreator.fbms.client.renderer.DogeRamRenderer;
import net.mcreator.fbms.client.renderer.DfredbearRenderer;
import net.mcreator.fbms.client.renderer.DchicaRenderer;
import net.mcreator.fbms.client.renderer.DMangleRenderer;
import net.mcreator.fbms.client.renderer.DFreddyRenderer;
import net.mcreator.fbms.client.renderer.DFoxyRenderer;
import net.mcreator.fbms.client.renderer.DBonnieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FbmsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FbmsModEntities.IMPALA.get(), ImpalaRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.DOGE_RAM.get(), DogeRamRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.D_FREDDY.get(), DFreddyRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.D_BONNIE.get(), DBonnieRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.DCHICA.get(), DchicaRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.D_FOXY.get(), DFoxyRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.DFREDBEAR.get(), DfredbearRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.D_MANGLE.get(), DMangleRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.STATION_WAGON.get(), StationWagonRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.SEAT.get(), SeatRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.RAT.get(), RatRenderer::new);
		event.registerEntityRenderer(FbmsModEntities.MYSTERIOUS_GIANT_SCUTTLERS.get(), MysteriousGiantScuttlersRenderer::new);
	}
}
