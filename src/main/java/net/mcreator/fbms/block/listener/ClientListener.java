package net.mcreator.fbms.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fbms.init.FbmsModBlockEntities;
import net.mcreator.fbms.block.renderer.WitheredDougTheDogTileRenderer;
import net.mcreator.fbms.block.renderer.WinkSignTileRenderer;
import net.mcreator.fbms.block.renderer.ToyFreddyTileRenderer;
import net.mcreator.fbms.block.renderer.ToyFoxyTileRenderer;
import net.mcreator.fbms.block.renderer.ToyChicaTileRenderer;
import net.mcreator.fbms.block.renderer.ToyBonnieTileRenderer;
import net.mcreator.fbms.block.renderer.TheMangleTileRenderer;
import net.mcreator.fbms.block.renderer.StephanPlushTileRenderer;
import net.mcreator.fbms.block.renderer.StationWagonBlockTileRenderer;
import net.mcreator.fbms.block.renderer.ShredBearTileRenderer;
import net.mcreator.fbms.block.renderer.SecurityPuppetTileRenderer;
import net.mcreator.fbms.block.renderer.ScrapTrapTileRenderer;
import net.mcreator.fbms.block.renderer.SanitationStationTileRenderer;
import net.mcreator.fbms.block.renderer.RustyTileRenderer;
import net.mcreator.fbms.block.renderer.RustyAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.RoseyTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarFreddyTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarFreddyAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarFoxyTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarFoxyAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarChicaTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarChicaAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarBonnieTileRenderer;
import net.mcreator.fbms.block.renderer.RockStarBonnieAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.RidingRocketsRedTileRenderer;
import net.mcreator.fbms.block.renderer.RidingRocketsPurpleTileRenderer;
import net.mcreator.fbms.block.renderer.RetroChicaTileRenderer;
import net.mcreator.fbms.block.renderer.RascTileRenderer;
import net.mcreator.fbms.block.renderer.PuppetBoxTileRenderer;
import net.mcreator.fbms.block.renderer.PrizeKingTileRenderer;
import net.mcreator.fbms.block.renderer.PinTheBowtieOnTheTieTheToyFreddyTileRenderer;
import net.mcreator.fbms.block.renderer.PinTheBowtieOnTheFreddyTileRenderer;
import net.mcreator.fbms.block.renderer.PigPatchTileRenderer;
import net.mcreator.fbms.block.renderer.PigPatchAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.PicklesTileRenderer;
import net.mcreator.fbms.block.renderer.PaperPlatesTileRenderer;
import net.mcreator.fbms.block.renderer.PanStanTileRenderer;
import net.mcreator.fbms.block.renderer.OrvilleTileRenderer;
import net.mcreator.fbms.block.renderer.OrvilleAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.OldFreddyTileRenderer;
import net.mcreator.fbms.block.renderer.OldFoxyTileRenderer;
import net.mcreator.fbms.block.renderer.OldChicaTileRenderer;
import net.mcreator.fbms.block.renderer.OldBonnieTileRenderer;
import net.mcreator.fbms.block.renderer.Number1CrateTileRenderer;
import net.mcreator.fbms.block.renderer.NoveltyTrafficLightTileRenderer;
import net.mcreator.fbms.block.renderer.NeonStageLightsPinkTileRenderer;
import net.mcreator.fbms.block.renderer.NeonStageLightsBlueTileRenderer;
import net.mcreator.fbms.block.renderer.NeonStageLightGreenTileRenderer;
import net.mcreator.fbms.block.renderer.NeonPartySet4TileRenderer;
import net.mcreator.fbms.block.renderer.NeonPartySet3TileRenderer;
import net.mcreator.fbms.block.renderer.NeonPartySet2TileRenderer;
import net.mcreator.fbms.block.renderer.NeonPartySet1TileRenderer;
import net.mcreator.fbms.block.renderer.NeonJukeBoxTileRenderer;
import net.mcreator.fbms.block.renderer.NeddBearTileRenderer;
import net.mcreator.fbms.block.renderer.NeddBearAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.MusicManTileRenderer;
import net.mcreator.fbms.block.renderer.MusicManAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.MrHugsTileRenderer;
import net.mcreator.fbms.block.renderer.MrHippoTileRenderer;
import net.mcreator.fbms.block.renderer.MrHippoAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.MrCanDoTileRenderer;
import net.mcreator.fbms.block.renderer.MoltenSitTileRenderer;
import net.mcreator.fbms.block.renderer.MoltenFreddyTileRenderer;
import net.mcreator.fbms.block.renderer.MoldyRabbitTileRenderer;
import net.mcreator.fbms.block.renderer.MidnightMotoristTileRenderer;
import net.mcreator.fbms.block.renderer.LolBitTileRenderer;
import net.mcreator.fbms.block.renderer.LolBitDtTileRenderer;
import net.mcreator.fbms.block.renderer.LolBit409TileRenderer;
import net.mcreator.fbms.block.renderer.LemonadeClownTileRenderer;
import net.mcreator.fbms.block.renderer.LeftyTileRenderer;
import net.mcreator.fbms.block.renderer.LeftyAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.LargeSignTileRenderer;
import net.mcreator.fbms.block.renderer.LargeSign4TileRenderer;
import net.mcreator.fbms.block.renderer.LargeSign3TileRenderer;
import net.mcreator.fbms.block.renderer.LargeSign2TileRenderer;
import net.mcreator.fbms.block.renderer.LadderTowerTileRenderer;
import net.mcreator.fbms.block.renderer.ImpalaBlockTileRenderer;
import net.mcreator.fbms.block.renderer.IgnitedChicaTileRenderer;
import net.mcreator.fbms.block.renderer.HappyFrogTileRenderer;
import net.mcreator.fbms.block.renderer.HappYFrogAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.GravityVortexTileRenderer;
import net.mcreator.fbms.block.renderer.GravityVortex2TileRenderer;
import net.mcreator.fbms.block.renderer.GarfPlushTileRenderer;
import net.mcreator.fbms.block.renderer.FuntimeDelilahblockTileRenderer;
import net.mcreator.fbms.block.renderer.FuntimeDelilahTileRenderer;
import net.mcreator.fbms.block.renderer.FuntimeChicaAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.FunTimeChicaTileRenderer;
import net.mcreator.fbms.block.renderer.FtFoxyTileRenderer;
import net.mcreator.fbms.block.renderer.FruityMazeTileRenderer;
import net.mcreator.fbms.block.renderer.FruitPunchClownTileRenderer;
import net.mcreator.fbms.block.renderer.FreddyFazBearTileRenderer;
import net.mcreator.fbms.block.renderer.FoxyTileRenderer;
import net.mcreator.fbms.block.renderer.FoilPartySet4TileRenderer;
import net.mcreator.fbms.block.renderer.FoilPartySet3TileRenderer;
import net.mcreator.fbms.block.renderer.FoilPartySet2TileRenderer;
import net.mcreator.fbms.block.renderer.FoilPartySet1TileRenderer;
import net.mcreator.fbms.block.renderer.EnhancedSpeakerSetTileRenderer;
import net.mcreator.fbms.block.renderer.Endo02TileRenderer;
import net.mcreator.fbms.block.renderer.Endo01TileRenderer;
import net.mcreator.fbms.block.renderer.Endo01AnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.ElChipTileRenderer;
import net.mcreator.fbms.block.renderer.ElChipAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.EggBabyTileRenderer;
import net.mcreator.fbms.block.renderer.DuckPondTileRenderer;
import net.mcreator.fbms.block.renderer.DrTeathTileRenderer;
import net.mcreator.fbms.block.renderer.DougTheDogTileRenderer;
import net.mcreator.fbms.block.renderer.DogeRamBlockTileRenderer;
import net.mcreator.fbms.block.renderer.DocPlushTileRenderer;
import net.mcreator.fbms.block.renderer.DiscountCoolingUnitTileRenderer;
import net.mcreator.fbms.block.renderer.DiscountBallpitTileRenderer;
import net.mcreator.fbms.block.renderer.DeluxeSpeakerSetTileRenderer;
import net.mcreator.fbms.block.renderer.DBalloonBoyTileRenderer;
import net.mcreator.fbms.block.renderer.ChicaTileRenderer;
import net.mcreator.fbms.block.renderer.CeilingStageLightsTileRenderer;
import net.mcreator.fbms.block.renderer.CeilingStageLightpinkTileRenderer;
import net.mcreator.fbms.block.renderer.CeilingStageLightblueTileRenderer;
import net.mcreator.fbms.block.renderer.CarnivalHoopsTileRenderer;
import net.mcreator.fbms.block.renderer.CandyCadetTileRenderer;
import net.mcreator.fbms.block.renderer.BucketBobTileRenderer;
import net.mcreator.fbms.block.renderer.BrokenFreddyTileRenderer;
import net.mcreator.fbms.block.renderer.BrokenChicaTileRenderer;
import net.mcreator.fbms.block.renderer.BrokenBonnieTileRenderer;
import net.mcreator.fbms.block.renderer.BrokenBarryPolarAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.BonnieTileRenderer;
import net.mcreator.fbms.block.renderer.BonnetTileRenderer;
import net.mcreator.fbms.block.renderer.BonkABonTileRenderer;
import net.mcreator.fbms.block.renderer.BonBonTileRenderer;
import net.mcreator.fbms.block.renderer.BiteFredBearCutoutTileRenderer;
import net.mcreator.fbms.block.renderer.BephAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.BarryPolarTileRenderer;
import net.mcreator.fbms.block.renderer.BarryPolarFixedTileRenderer;
import net.mcreator.fbms.block.renderer.BarryPolarAnimatedTileRenderer;
import net.mcreator.fbms.block.renderer.BalloonCartTileRenderer;
import net.mcreator.fbms.block.renderer.BalloonBoyTileRenderer;
import net.mcreator.fbms.block.renderer.BallPitTowerTileRenderer;
import net.mcreator.fbms.block.renderer.BaggyMaggieTileRenderer;
import net.mcreator.fbms.FbmsMod;

@Mod.EventBusSubscriber(modid = FbmsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MR_HUGS.get(), MrHugsTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NUMBER_1_CRATE.get(), Number1CrateTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BAGGY_MAGGIE.get(), BaggyMaggieTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ENDO_01.get(), Endo01TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.CANDY_CADET.get(), CandyCadetTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.HAPPY_FROG.get(), HappyFrogTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MR_HIPPO.get(), MrHippoTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEDD_BEAR.get(), NeddBearTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PIG_PATCH.get(), PigPatchTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FREDDY_FAZ_BEAR.get(), FreddyFazBearTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LEFTY.get(), LeftyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_BONNIE.get(), RockStarBonnieTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_CHICA.get(), RockStarChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_FREDDY.get(), RockStarFreddyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_FOXY.get(), RockStarFoxyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ORVILLE.get(), OrvilleTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.SECURITY_PUPPET.get(), SecurityPuppetTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PUPPET_BOX.get(), PuppetBoxTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.EL_CHIP.get(), ElChipTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MUSIC_MAN.get(), MusicManTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FUN_TIME_CHICA.get(), FunTimeChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PRIZE_KING.get(), PrizeKingTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MOLTEN_FREDDY.get(), MoltenFreddyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MOLTEN_SIT.get(), MoltenSitTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.IGNITED_CHICA.get(), IgnitedChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.THE_MANGLE.get(), TheMangleTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BARRY_POLAR_FIXED.get(), BarryPolarFixedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BARRY_POLAR.get(), BarryPolarTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FUNTIME_DELILAHBLOCK.get(), FuntimeDelilahblockTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MOLDY_RABBIT.get(), MoldyRabbitTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DR_TEATH.get(), DrTeathTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BITE_FRED_BEAR_CUTOUT.get(), BiteFredBearCutoutTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.RUSTY.get(), RustyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.WINK_SIGN.get(), WinkSignTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.SCRAP_TRAP.get(), ScrapTrapTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LARGE_SIGN.get(), LargeSignTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LARGE_SIGN_2.get(), LargeSign2TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LARGE_SIGN_3.get(), LargeSign3TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LARGE_SIGN_4.get(), LargeSign4TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DISCOUNT_BALLPIT.get(), DiscountBallpitTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DUCK_POND.get(), DuckPondTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.SANITATION_STATION.get(), SanitationStationTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PIN_THE_BOWTIE_ON_THE_FREDDY.get(), PinTheBowtieOnTheFreddyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PIN_THE_BOWTIE_ON_THE_TIE_THE_TOY_FREDDY.get(), PinTheBowtieOnTheTieTheToyFreddyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DELUXE_SPEAKER_SET.get(), DeluxeSpeakerSetTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ENHANCED_SPEAKER_SET.get(), EnhancedSpeakerSetTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NOVELTY_TRAFFIC_LIGHT.get(), NoveltyTrafficLightTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MIDNIGHT_MOTORIST.get(), MidnightMotoristTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FRUITY_MAZE.get(), FruityMazeTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FOIL_PARTY_SET_1.get(), FoilPartySet1TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FOIL_PARTY_SET_2.get(), FoilPartySet2TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FOIL_PARTY_SET_3.get(), FoilPartySet3TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FOIL_PARTY_SET_4.get(), FoilPartySet4TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_JUKE_BOX.get(), NeonJukeBoxTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LADDER_TOWER.get(), LadderTowerTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LEMONADE_CLOWN.get(), LemonadeClownTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FRUIT_PUNCH_CLOWN.get(), FruitPunchClownTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BALL_PIT_TOWER.get(), BallPitTowerTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_PARTY_SET_1.get(), NeonPartySet1TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_PARTY_SET_2.get(), NeonPartySet2TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_PARTY_SET_3.get(), NeonPartySet3TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_PARTY_SET_4.get(), NeonPartySet4TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.EGG_BABY.get(), EggBabyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ENDO_01_ANIMATED.get(), Endo01AnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.HAPP_Y_FROG_ANIMATED.get(), HappYFrogAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MR_HIPPO_ANIMATED.get(), MrHippoAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PIG_PATCH_ANIMATED.get(), PigPatchAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEDD_BEAR_ANIMATED.get(), NeddBearAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LEFTY_ANIMATED.get(), LeftyAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_BONNIE_ANIMATED.get(), RockStarBonnieAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_CHICA_ANIMATED.get(), RockStarChicaAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_FREDDY_ANIMATED.get(), RockStarFreddyAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROCK_STAR_FOXY_ANIMATED.get(), RockStarFoxyAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.EL_CHIP_ANIMATED.get(), ElChipAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FUNTIME_CHICA_ANIMATED.get(), FuntimeChicaAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MUSIC_MAN_ANIMATED.get(), MusicManAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ORVILLE_ANIMATED.get(), OrvilleAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.RUSTY_ANIMATED.get(), RustyAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BARRY_POLAR_ANIMATED.get(), BarryPolarAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BROKEN_BARRY_POLAR_ANIMATED.get(), BrokenBarryPolarAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FUNTIME_DELILAH.get(), FuntimeDelilahTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BEPH_ANIMATED.get(), BephAnimatedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.IMPALA_BLOCK.get(), ImpalaBlockTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DOGE_RAM_BLOCK.get(), DogeRamBlockTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.STATION_WAGON_BLOCK.get(), StationWagonBlockTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.OLD_BONNIE.get(), OldBonnieTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.OLD_FREDDY.get(), OldFreddyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.OLD_CHICA.get(), OldChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.OLD_FOXY.get(), OldFoxyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.D_BALLOON_BOY.get(), DBalloonBoyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DOC_PLUSH.get(), DocPlushTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.GARF_PLUSH.get(), GarfPlushTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ROSEY.get(), RoseyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.STEPHAN_PLUSH.get(), StephanPlushTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PAN_STAN.get(), PanStanTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BUCKET_BOB.get(), BucketBobTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.MR_CAN_DO.get(), MrCanDoTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BALLOON_BOY.get(), BalloonBoyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BON_BON.get(), BonBonTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BONNET.get(), BonnetTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BONNIE.get(), BonnieTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.CHICA.get(), ChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FOXY.get(), FoxyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.FT_FOXY.get(), FtFoxyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LOL_BIT.get(), LolBitTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LOL_BIT_DT.get(), LolBitDtTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.RETRO_CHICA.get(), RetroChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.TOY_FREDDY.get(), ToyFreddyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.TOY_FOXY.get(), ToyFoxyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.TOY_CHICA.get(), ToyChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.TOY_BONNIE.get(), ToyBonnieTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BONK_A_BON.get(), BonkABonTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BROKEN_FREDDY.get(), BrokenFreddyTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BROKEN_BONNIE.get(), BrokenBonnieTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BROKEN_CHICA.get(), BrokenChicaTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.CARNIVAL_HOOPS.get(), CarnivalHoopsTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.GRAVITY_VORTEX.get(), GravityVortexTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.GRAVITY_VORTEX_2.get(), GravityVortex2TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PICKLES.get(), PicklesTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DOUG_THE_DOG.get(), DougTheDogTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.WITHERED_DOUG_THE_DOG.get(), WitheredDougTheDogTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.ENDO_02.get(), Endo02TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.DISCOUNT_COOLING_UNIT.get(), DiscountCoolingUnitTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.RASC.get(), RascTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.SHRED_BEAR.get(), ShredBearTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.LOL_BIT_409.get(), LolBit409TileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.BALLOON_CART.get(), BalloonCartTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.RIDING_ROCKETS_RED.get(), RidingRocketsRedTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.RIDING_ROCKETS_PURPLE.get(), RidingRocketsPurpleTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.PAPER_PLATES.get(), PaperPlatesTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_STAGE_LIGHT_GREEN.get(), NeonStageLightGreenTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_STAGE_LIGHTS_PINK.get(), NeonStageLightsPinkTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.NEON_STAGE_LIGHTS_BLUE.get(), NeonStageLightsBlueTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.CEILING_STAGE_LIGHTS.get(), CeilingStageLightsTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.CEILING_STAGE_LIGHTPINK.get(), CeilingStageLightpinkTileRenderer::new);
		event.registerBlockEntityRenderer(FbmsModBlockEntities.CEILING_STAGE_LIGHTBLUE.get(), CeilingStageLightblueTileRenderer::new);
	}
}
