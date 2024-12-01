
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fbms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.fbms.item.WandItem;
import net.mcreator.fbms.item.TrumpetItem;
import net.mcreator.fbms.item.ToyMicItem;
import net.mcreator.fbms.item.RemoteItem;
import net.mcreator.fbms.item.PizzaItem;
import net.mcreator.fbms.item.MoldyPizzaItem;
import net.mcreator.fbms.item.MoldyHotDogItem;
import net.mcreator.fbms.item.MoldyFriesItem;
import net.mcreator.fbms.item.MoldyFriedChickenItem;
import net.mcreator.fbms.item.MoldyCheesePizzaItem;
import net.mcreator.fbms.item.MaracasItem;
import net.mcreator.fbms.item.MandolinItem;
import net.mcreator.fbms.item.HotDogItem;
import net.mcreator.fbms.item.HazmatSuitItem;
import net.mcreator.fbms.item.GuitarItem;
import net.mcreator.fbms.item.GoldenBiteItem;
import net.mcreator.fbms.item.GlassesItem;
import net.mcreator.fbms.item.GasMaskItem;
import net.mcreator.fbms.item.FriesItem;
import net.mcreator.fbms.item.FriedChickenItem;
import net.mcreator.fbms.item.FATItem;
import net.mcreator.fbms.item.CupFiztime2Item;
import net.mcreator.fbms.item.CupFiztime1Item;
import net.mcreator.fbms.item.CpuItem;
import net.mcreator.fbms.item.CoinsItem;
import net.mcreator.fbms.item.CheesePizzaItem;
import net.mcreator.fbms.item.BanjoItem;
import net.mcreator.fbms.item.AdItem;
import net.mcreator.fbms.item.AccordionItem;
import net.mcreator.fbms.block.display.WitheredWallyWalrusDisplayItem;
import net.mcreator.fbms.block.display.WitheredPuffyPuffinsDisplayItem;
import net.mcreator.fbms.block.display.WitheredHazyReindeerDisplayItem;
import net.mcreator.fbms.block.display.WitheredDougTheDogDisplayItem;
import net.mcreator.fbms.block.display.WinkSignDisplayItem;
import net.mcreator.fbms.block.display.WallyWalrusDisplayItem;
import net.mcreator.fbms.block.display.WallyWalrusAnimatedDisplayItem;
import net.mcreator.fbms.block.display.ToyFreddyDisplayItem;
import net.mcreator.fbms.block.display.ToyFoxyDisplayItem;
import net.mcreator.fbms.block.display.ToyChicaDisplayItem;
import net.mcreator.fbms.block.display.ToyBonnieDisplayItem;
import net.mcreator.fbms.block.display.TheMangleDisplayItem;
import net.mcreator.fbms.block.display.StephanPlushDisplayItem;
import net.mcreator.fbms.block.display.StationWagonBlockDisplayItem;
import net.mcreator.fbms.block.display.StEndoDisplayItem;
import net.mcreator.fbms.block.display.StEndoAnimatedDisplayItem;
import net.mcreator.fbms.block.display.SignSNSDisplayItem;
import net.mcreator.fbms.block.display.SignSBTDisplayItem;
import net.mcreator.fbms.block.display.SignRFADisplayItem;
import net.mcreator.fbms.block.display.SignMSDisplayItem;
import net.mcreator.fbms.block.display.SignDDWDisplayItem;
import net.mcreator.fbms.block.display.ShredBearDisplayItem;
import net.mcreator.fbms.block.display.SecurityPuppetDisplayItem;
import net.mcreator.fbms.block.display.ScrapTrapDisplayItem;
import net.mcreator.fbms.block.display.SanitationStationDisplayItem;
import net.mcreator.fbms.block.display.SalvagedJollyDisplayItem;
import net.mcreator.fbms.block.display.RustyDisplayItem;
import net.mcreator.fbms.block.display.RustyAnimatedDisplayItem;
import net.mcreator.fbms.block.display.RottenPitDisplayItem;
import net.mcreator.fbms.block.display.RoseyDisplayItem;
import net.mcreator.fbms.block.display.RockStarFreddyDisplayItem;
import net.mcreator.fbms.block.display.RockStarFreddyAnimatedDisplayItem;
import net.mcreator.fbms.block.display.RockStarFoxyDisplayItem;
import net.mcreator.fbms.block.display.RockStarFoxyAnimatedDisplayItem;
import net.mcreator.fbms.block.display.RockStarChicaDisplayItem;
import net.mcreator.fbms.block.display.RockStarChicaAnimatedDisplayItem;
import net.mcreator.fbms.block.display.RockStarBonnieDisplayItem;
import net.mcreator.fbms.block.display.RockStarBonnieAnimatedDisplayItem;
import net.mcreator.fbms.block.display.RidingRocketsRedDisplayItem;
import net.mcreator.fbms.block.display.RidingRocketsPurpleDisplayItem;
import net.mcreator.fbms.block.display.RetroChicaDisplayItem;
import net.mcreator.fbms.block.display.RetroChicaAnimatedDisplayItem;
import net.mcreator.fbms.block.display.RascDisplayItem;
import net.mcreator.fbms.block.display.PuppetBoxDisplayItem;
import net.mcreator.fbms.block.display.PuffyPuffinsDisplayItem;
import net.mcreator.fbms.block.display.PuffyPuffinsAnimatedDisplayItem;
import net.mcreator.fbms.block.display.ProjectorDisplayItem;
import net.mcreator.fbms.block.display.ProjectionDisplayItem;
import net.mcreator.fbms.block.display.PrizeKingDisplayItem;
import net.mcreator.fbms.block.display.PizzaPlaceSignOldDisplayItem;
import net.mcreator.fbms.block.display.PizzaPlaceSignDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox93OpenDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox93ClosedDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox87OpenDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox87ClosedDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox85OpenDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox85ClosedDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox24OpenDisplayItem;
import net.mcreator.fbms.block.display.PizzaBox24ClosedDisplayItem;
import net.mcreator.fbms.block.display.PinballToyFreddyDisplayItem;
import net.mcreator.fbms.block.display.PinTheBowtieOnTheTieTheToyFreddyDisplayItem;
import net.mcreator.fbms.block.display.PinTheBowtieOnTheFreddyDisplayItem;
import net.mcreator.fbms.block.display.PigPatchDisplayItem;
import net.mcreator.fbms.block.display.PigPatchAnimatedDisplayItem;
import net.mcreator.fbms.block.display.PicklesDisplayItem;
import net.mcreator.fbms.block.display.PaperPlatesDisplayItem;
import net.mcreator.fbms.block.display.PanStanDisplayItem;
import net.mcreator.fbms.block.display.OrvilleDisplayItem;
import net.mcreator.fbms.block.display.OrvilleAnimatedDisplayItem;
import net.mcreator.fbms.block.display.OldFreddyDisplayItem;
import net.mcreator.fbms.block.display.OldFoxyDisplayItem;
import net.mcreator.fbms.block.display.OldChicaDisplayItem;
import net.mcreator.fbms.block.display.OldBonnieDisplayItem;
import net.mcreator.fbms.block.display.Number1CrateDisplayItem;
import net.mcreator.fbms.block.display.NoveltyTrafficLightDisplayItem;
import net.mcreator.fbms.block.display.NeonStageLightsPinkDisplayItem;
import net.mcreator.fbms.block.display.NeonStageLightsOrangeDisplayItem;
import net.mcreator.fbms.block.display.NeonStageLightsBlueDisplayItem;
import net.mcreator.fbms.block.display.NeonStageLightGreenDisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet4DisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet3DisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet2DisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet1DisplayItem;
import net.mcreator.fbms.block.display.NeonJukeBoxOffDisplayItem;
import net.mcreator.fbms.block.display.NeonJukeBoxDisplayItem;
import net.mcreator.fbms.block.display.NeddBearDisplayItem;
import net.mcreator.fbms.block.display.NeddBearAnimatedDisplayItem;
import net.mcreator.fbms.block.display.MusicManDisplayItem;
import net.mcreator.fbms.block.display.MusicManAnimatedDisplayItem;
import net.mcreator.fbms.block.display.MrHugsDisplayItem;
import net.mcreator.fbms.block.display.MrHippoDisplayItem;
import net.mcreator.fbms.block.display.MrHippoAnimatedDisplayItem;
import net.mcreator.fbms.block.display.MrCanDoDisplayItem;
import net.mcreator.fbms.block.display.MoltenSitDisplayItem;
import net.mcreator.fbms.block.display.MoltenFreddyDisplayItem;
import net.mcreator.fbms.block.display.MoldyRabbitDisplayItem;
import net.mcreator.fbms.block.display.MidnightMotoristDisplayItem;
import net.mcreator.fbms.block.display.Megaultimatespeakertron3000DisplayItem;
import net.mcreator.fbms.block.display.LolbitRecordDisplayItem;
import net.mcreator.fbms.block.display.LolBitDtDisplayItem;
import net.mcreator.fbms.block.display.LolBitDisplayItem;
import net.mcreator.fbms.block.display.LolBit409DisplayItem;
import net.mcreator.fbms.block.display.LemonadeClownDisplayItem;
import net.mcreator.fbms.block.display.LeftyDisplayItem;
import net.mcreator.fbms.block.display.LeftyAnimatedDisplayItem;
import net.mcreator.fbms.block.display.LargeSignDisplayItem;
import net.mcreator.fbms.block.display.LargeSign4DisplayItem;
import net.mcreator.fbms.block.display.LargeSign3DisplayItem;
import net.mcreator.fbms.block.display.LargeSign2DisplayItem;
import net.mcreator.fbms.block.display.LadderTowerDisplayItem;
import net.mcreator.fbms.block.display.JollyTheRatDisplayItem;
import net.mcreator.fbms.block.display.JollyTheRatAnimatedDisplayItem;
import net.mcreator.fbms.block.display.JeffsPizzaSignDisplayItem;
import net.mcreator.fbms.block.display.ImpalaBlockDisplayItem;
import net.mcreator.fbms.block.display.IgnitedChicaDisplayItem;
import net.mcreator.fbms.block.display.HelpyCutOutDisplayItem;
import net.mcreator.fbms.block.display.HeavyDuityDoorDisplayItem;
import net.mcreator.fbms.block.display.HeavyDuityDoorClosedDisplayItem;
import net.mcreator.fbms.block.display.HazyReindeerDisplayItem;
import net.mcreator.fbms.block.display.HazyReindeerAnimatedDisplayItem;
import net.mcreator.fbms.block.display.HappyFrogDisplayItem;
import net.mcreator.fbms.block.display.HappYFrogAnimatedDisplayItem;
import net.mcreator.fbms.block.display.GusThePugDisplayItem;
import net.mcreator.fbms.block.display.GusThePugAnimatedDisplayItem;
import net.mcreator.fbms.block.display.GtEndoDisplayItem;
import net.mcreator.fbms.block.display.GtEndoAnimatedDisplayItem;
import net.mcreator.fbms.block.display.GravityVortexDisplayItem;
import net.mcreator.fbms.block.display.GravityVortex2DisplayItem;
import net.mcreator.fbms.block.display.GarfPlushDisplayItem;
import net.mcreator.fbms.block.display.FuntimeDelilahblockDisplayItem;
import net.mcreator.fbms.block.display.FuntimeDelilahDisplayItem;
import net.mcreator.fbms.block.display.FuntimeChicaAnimatedDisplayItem;
import net.mcreator.fbms.block.display.FunTimeChicaDisplayItem;
import net.mcreator.fbms.block.display.FtFoxyDisplayItem;
import net.mcreator.fbms.block.display.FruityMazeDisplayItem;
import net.mcreator.fbms.block.display.FruitPunchClownDisplayItem;
import net.mcreator.fbms.block.display.FrightsSignDisplayItem;
import net.mcreator.fbms.block.display.FrightsSign2DisplayItem;
import net.mcreator.fbms.block.display.FreddyFazBearDisplayItem;
import net.mcreator.fbms.block.display.FreddyCutOutDisplayItem;
import net.mcreator.fbms.block.display.FoxyDisplayItem;
import net.mcreator.fbms.block.display.FoilPartySet4DisplayItem;
import net.mcreator.fbms.block.display.FoilPartySet3DisplayItem;
import net.mcreator.fbms.block.display.FoilPartySet2DisplayItem;
import net.mcreator.fbms.block.display.FoilPartySet1DisplayItem;
import net.mcreator.fbms.block.display.EnhancedSpeakerSetDisplayItem;
import net.mcreator.fbms.block.display.Endo02DisplayItem;
import net.mcreator.fbms.block.display.Endo01DisplayItem;
import net.mcreator.fbms.block.display.Endo01AnimatedDisplayItem;
import net.mcreator.fbms.block.display.ElChipDisplayItem;
import net.mcreator.fbms.block.display.ElChipAnimatedDisplayItem;
import net.mcreator.fbms.block.display.EggBabyDisplayItem;
import net.mcreator.fbms.block.display.DuckPondDisplayItem;
import net.mcreator.fbms.block.display.DrTeathDisplayItem;
import net.mcreator.fbms.block.display.DougTheDogDisplayItem;
import net.mcreator.fbms.block.display.DougTheDogAnimatedDisplayItem;
import net.mcreator.fbms.block.display.DollsDisplayItem;
import net.mcreator.fbms.block.display.DogeRamBlockDisplayItem;
import net.mcreator.fbms.block.display.DocPlushDisplayItem;
import net.mcreator.fbms.block.display.DiscountCoolingUnitDisplayItem;
import net.mcreator.fbms.block.display.DiscountBallpitDisplayItem;
import net.mcreator.fbms.block.display.DeluxeSpeakerSetDisplayItem;
import net.mcreator.fbms.block.display.DeluxeBallpitDisplayItem;
import net.mcreator.fbms.block.display.DBalloonBoyDisplayItem;
import net.mcreator.fbms.block.display.Coins5DisplayItem;
import net.mcreator.fbms.block.display.Coins25DisplayItem;
import net.mcreator.fbms.block.display.Coins100DisplayItem;
import net.mcreator.fbms.block.display.Coins1000DisplayItem;
import net.mcreator.fbms.block.display.Coins10000DisplayItem;
import net.mcreator.fbms.block.display.CoinDisplayItem;
import net.mcreator.fbms.block.display.ChicaDisplayItem;
import net.mcreator.fbms.block.display.ChicaCutOutDisplayItem;
import net.mcreator.fbms.block.display.CeilingStageLightsDisplayItem;
import net.mcreator.fbms.block.display.CeilingStageLightpinkDisplayItem;
import net.mcreator.fbms.block.display.CeilingStageLightblueDisplayItem;
import net.mcreator.fbms.block.display.CeilingStageLightOrangeDisplayItem;
import net.mcreator.fbms.block.display.CarnivalHoopsDisplayItem;
import net.mcreator.fbms.block.display.CandyCadetDisplayItem;
import net.mcreator.fbms.block.display.CamDisplayItem;
import net.mcreator.fbms.block.display.BuffetEndoDisplayItem;
import net.mcreator.fbms.block.display.BucketBobDisplayItem;
import net.mcreator.fbms.block.display.BrokenFreddyDisplayItem;
import net.mcreator.fbms.block.display.BrokenChicaDisplayItem;
import net.mcreator.fbms.block.display.BrokenBonnieDisplayItem;
import net.mcreator.fbms.block.display.BrokenBarryPolarAnimatedDisplayItem;
import net.mcreator.fbms.block.display.BonnieDisplayItem;
import net.mcreator.fbms.block.display.BonnieCutOutDisplayItem;
import net.mcreator.fbms.block.display.BonnetDisplayItem;
import net.mcreator.fbms.block.display.BonkABonDisplayItem;
import net.mcreator.fbms.block.display.BonBonDisplayItem;
import net.mcreator.fbms.block.display.BiteFredBearCutoutDisplayItem;
import net.mcreator.fbms.block.display.BarryPolarFixedDisplayItem;
import net.mcreator.fbms.block.display.BarryPolarDisplayItem;
import net.mcreator.fbms.block.display.BarryPolarAnimatedDisplayItem;
import net.mcreator.fbms.block.display.BalloonCartDisplayItem;
import net.mcreator.fbms.block.display.BalloonBoyDisplayItem;
import net.mcreator.fbms.block.display.BallPitTowerDisplayItem;
import net.mcreator.fbms.block.display.BaggyMaggieDisplayItem;
import net.mcreator.fbms.FbmsMod;

public class FbmsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FbmsMod.MODID);
	public static final RegistryObject<Item> BLACK_WHITE_CLEAN_TILES = block(FbmsModBlocks.BLACK_WHITE_CLEAN_TILES, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_CLEAN_TILE_STAIRS = block(FbmsModBlocks.BLACK_WHITE_CLEAN_TILE_STAIRS, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_CLEAN_TILE_SLAB = block(FbmsModBlocks.BLACK_WHITE_CLEAN_TILE_SLAB, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_CONFETTI_TILES = block(FbmsModBlocks.BLACK_WHITE_CONFETTI_TILES, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_CONFETTI_TILE_STAIRS = block(FbmsModBlocks.BLACK_WHITE_CONFETTI_TILE_STAIRS, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_CONFETTI_TILE_SLAB = block(FbmsModBlocks.BLACK_WHITE_CONFETTI_TILE_SLAB, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> DISCO_PIZZA = block(FbmsModBlocks.DISCO_PIZZA, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> SCRAP_STAGE_BLOCK = block(FbmsModBlocks.SCRAP_STAGE_BLOCK, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> SCRAP_STAGE_BLOCK_STAIRS = block(FbmsModBlocks.SCRAP_STAGE_BLOCK_STAIRS, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> SCRAP_STAGE_BLOCK_SLAB = block(FbmsModBlocks.SCRAP_STAGE_BLOCK_SLAB, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> RED_STAGE_BLOCK = block(FbmsModBlocks.RED_STAGE_BLOCK, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> PURPLE_STAGE_BLOCK = block(FbmsModBlocks.PURPLE_STAGE_BLOCK, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> BASIC_STAGE_BLOCK_STAIRS = block(FbmsModBlocks.BASIC_STAGE_BLOCK_STAIRS, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> BASIC_STAGE_BLOCK_SLAB = block(FbmsModBlocks.BASIC_STAGE_BLOCK_SLAB, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> STAR_ARCH = block(FbmsModBlocks.STAR_ARCH, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> PAPER_PAL_CLOWN = block(FbmsModBlocks.PAPER_PAL_CLOWN, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> PAPPER_PAL_MR_HIPPO = block(FbmsModBlocks.PAPPER_PAL_MR_HIPPO, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> PAPPER_PAL_ORVIL = block(FbmsModBlocks.PAPPER_PAL_ORVIL, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> GUMBALL_SWIVEL_HANDS = block(FbmsModBlocks.GUMBALL_SWIVEL_HANDS, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> LEMONADE_CLOWN = REGISTRY.register(FbmsModBlocks.LEMONADE_CLOWN.getId().getPath(),
			() -> new LemonadeClownDisplayItem(FbmsModBlocks.LEMONADE_CLOWN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> FRUIT_PUNCH_CLOWN = REGISTRY.register(FbmsModBlocks.FRUIT_PUNCH_CLOWN.getId().getPath(),
			() -> new FruitPunchClownDisplayItem(FbmsModBlocks.FRUIT_PUNCH_CLOWN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> BALLOON_BARREL = block(FbmsModBlocks.BALLOON_BARREL, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MIDNIGHT_MOTORIST = REGISTRY.register(FbmsModBlocks.MIDNIGHT_MOTORIST.getId().getPath(),
			() -> new MidnightMotoristDisplayItem(FbmsModBlocks.MIDNIGHT_MOTORIST.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> FRUITY_MAZE = REGISTRY.register(FbmsModBlocks.FRUITY_MAZE.getId().getPath(), () -> new FruityMazeDisplayItem(FbmsModBlocks.FRUITY_MAZE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> DISCOUNT_BALLPIT = REGISTRY.register(FbmsModBlocks.DISCOUNT_BALLPIT.getId().getPath(),
			() -> new DiscountBallpitDisplayItem(FbmsModBlocks.DISCOUNT_BALLPIT.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> BALL_PIT_TOWER = REGISTRY.register(FbmsModBlocks.BALL_PIT_TOWER.getId().getPath(),
			() -> new BallPitTowerDisplayItem(FbmsModBlocks.BALL_PIT_TOWER.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> DELUXE_BALLPIT = REGISTRY.register(FbmsModBlocks.DELUXE_BALLPIT.getId().getPath(),
			() -> new DeluxeBallpitDisplayItem(FbmsModBlocks.DELUXE_BALLPIT.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> DUCK_POND = REGISTRY.register(FbmsModBlocks.DUCK_POND.getId().getPath(), () -> new DuckPondDisplayItem(FbmsModBlocks.DUCK_POND.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> SANITATION_STATION = REGISTRY.register(FbmsModBlocks.SANITATION_STATION.getId().getPath(),
			() -> new SanitationStationDisplayItem(FbmsModBlocks.SANITATION_STATION.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> PIN_THE_BOWTIE_ON_THE_FREDDY = REGISTRY.register(FbmsModBlocks.PIN_THE_BOWTIE_ON_THE_FREDDY.getId().getPath(),
			() -> new PinTheBowtieOnTheFreddyDisplayItem(FbmsModBlocks.PIN_THE_BOWTIE_ON_THE_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> PIN_THE_BOWTIE_ON_THE_TIE_THE_TOY_FREDDY = REGISTRY.register(FbmsModBlocks.PIN_THE_BOWTIE_ON_THE_TIE_THE_TOY_FREDDY.getId().getPath(),
			() -> new PinTheBowtieOnTheTieTheToyFreddyDisplayItem(FbmsModBlocks.PIN_THE_BOWTIE_ON_THE_TIE_THE_TOY_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> FOIL_PARTY_SET_1 = REGISTRY.register(FbmsModBlocks.FOIL_PARTY_SET_1.getId().getPath(),
			() -> new FoilPartySet1DisplayItem(FbmsModBlocks.FOIL_PARTY_SET_1.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> PAPER_PLATES = REGISTRY.register(FbmsModBlocks.PAPER_PLATES.getId().getPath(), () -> new PaperPlatesDisplayItem(FbmsModBlocks.PAPER_PLATES.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> FOIL_PARTY_SET_2 = REGISTRY.register(FbmsModBlocks.FOIL_PARTY_SET_2.getId().getPath(),
			() -> new FoilPartySet2DisplayItem(FbmsModBlocks.FOIL_PARTY_SET_2.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> FOIL_PARTY_SET_3 = REGISTRY.register(FbmsModBlocks.FOIL_PARTY_SET_3.getId().getPath(),
			() -> new FoilPartySet3DisplayItem(FbmsModBlocks.FOIL_PARTY_SET_3.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> FOIL_PARTY_SET_4 = REGISTRY.register(FbmsModBlocks.FOIL_PARTY_SET_4.getId().getPath(),
			() -> new FoilPartySet4DisplayItem(FbmsModBlocks.FOIL_PARTY_SET_4.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_PARTY_SET_1 = REGISTRY.register(FbmsModBlocks.NEON_PARTY_SET_1.getId().getPath(),
			() -> new NeonPartySet1DisplayItem(FbmsModBlocks.NEON_PARTY_SET_1.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_PARTY_SET_2 = REGISTRY.register(FbmsModBlocks.NEON_PARTY_SET_2.getId().getPath(),
			() -> new NeonPartySet2DisplayItem(FbmsModBlocks.NEON_PARTY_SET_2.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_PARTY_SET_3 = REGISTRY.register(FbmsModBlocks.NEON_PARTY_SET_3.getId().getPath(),
			() -> new NeonPartySet3DisplayItem(FbmsModBlocks.NEON_PARTY_SET_3.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_PARTY_SET_4 = REGISTRY.register(FbmsModBlocks.NEON_PARTY_SET_4.getId().getPath(),
			() -> new NeonPartySet4DisplayItem(FbmsModBlocks.NEON_PARTY_SET_4.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> LADDER_TOWER = REGISTRY.register(FbmsModBlocks.LADDER_TOWER.getId().getPath(), () -> new LadderTowerDisplayItem(FbmsModBlocks.LADDER_TOWER.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> EGG_BABY = REGISTRY.register(FbmsModBlocks.EGG_BABY.getId().getPath(), () -> new EggBabyDisplayItem(FbmsModBlocks.EGG_BABY.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> BONK_A_BON = REGISTRY.register(FbmsModBlocks.BONK_A_BON.getId().getPath(), () -> new BonkABonDisplayItem(FbmsModBlocks.BONK_A_BON.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CARNIVAL_HOOPS = REGISTRY.register(FbmsModBlocks.CARNIVAL_HOOPS.getId().getPath(),
			() -> new CarnivalHoopsDisplayItem(FbmsModBlocks.CARNIVAL_HOOPS.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> GRAVITY_VORTEX_2 = REGISTRY.register(FbmsModBlocks.GRAVITY_VORTEX_2.getId().getPath(),
			() -> new GravityVortex2DisplayItem(FbmsModBlocks.GRAVITY_VORTEX_2.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> PICKLES = REGISTRY.register(FbmsModBlocks.PICKLES.getId().getPath(), () -> new PicklesDisplayItem(FbmsModBlocks.PICKLES.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> DISCOUNT_COOLING_UNIT = REGISTRY.register(FbmsModBlocks.DISCOUNT_COOLING_UNIT.getId().getPath(),
			() -> new DiscountCoolingUnitDisplayItem(FbmsModBlocks.DISCOUNT_COOLING_UNIT.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> BALLOON_CART = REGISTRY.register(FbmsModBlocks.BALLOON_CART.getId().getPath(), () -> new BalloonCartDisplayItem(FbmsModBlocks.BALLOON_CART.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> RIDING_ROCKETS_RED = REGISTRY.register(FbmsModBlocks.RIDING_ROCKETS_RED.getId().getPath(),
			() -> new RidingRocketsRedDisplayItem(FbmsModBlocks.RIDING_ROCKETS_RED.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> RIDING_ROCKETS_PURPLE = REGISTRY.register(FbmsModBlocks.RIDING_ROCKETS_PURPLE.getId().getPath(),
			() -> new RidingRocketsPurpleDisplayItem(FbmsModBlocks.RIDING_ROCKETS_PURPLE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> DELUXE_SPEAKER_SET = REGISTRY.register(FbmsModBlocks.DELUXE_SPEAKER_SET.getId().getPath(),
			() -> new DeluxeSpeakerSetDisplayItem(FbmsModBlocks.DELUXE_SPEAKER_SET.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> ENHANCED_SPEAKER_SET = REGISTRY.register(FbmsModBlocks.ENHANCED_SPEAKER_SET.getId().getPath(),
			() -> new EnhancedSpeakerSetDisplayItem(FbmsModBlocks.ENHANCED_SPEAKER_SET.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_STAGE_LIGHT_GREEN = REGISTRY.register(FbmsModBlocks.NEON_STAGE_LIGHT_GREEN.getId().getPath(),
			() -> new NeonStageLightGreenDisplayItem(FbmsModBlocks.NEON_STAGE_LIGHT_GREEN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_STAGE_LIGHTS_PINK = REGISTRY.register(FbmsModBlocks.NEON_STAGE_LIGHTS_PINK.getId().getPath(),
			() -> new NeonStageLightsPinkDisplayItem(FbmsModBlocks.NEON_STAGE_LIGHTS_PINK.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_STAGE_LIGHTS_BLUE = REGISTRY.register(FbmsModBlocks.NEON_STAGE_LIGHTS_BLUE.getId().getPath(),
			() -> new NeonStageLightsBlueDisplayItem(FbmsModBlocks.NEON_STAGE_LIGHTS_BLUE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_STAGE_LIGHTS_ORANGE = REGISTRY.register(FbmsModBlocks.NEON_STAGE_LIGHTS_ORANGE.getId().getPath(),
			() -> new NeonStageLightsOrangeDisplayItem(FbmsModBlocks.NEON_STAGE_LIGHTS_ORANGE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CEILING_STAGE_LIGHTS = REGISTRY.register(FbmsModBlocks.CEILING_STAGE_LIGHTS.getId().getPath(),
			() -> new CeilingStageLightsDisplayItem(FbmsModBlocks.CEILING_STAGE_LIGHTS.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CEILING_STAGE_LIGHTPINK = REGISTRY.register(FbmsModBlocks.CEILING_STAGE_LIGHTPINK.getId().getPath(),
			() -> new CeilingStageLightpinkDisplayItem(FbmsModBlocks.CEILING_STAGE_LIGHTPINK.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CEILING_STAGE_LIGHTBLUE = REGISTRY.register(FbmsModBlocks.CEILING_STAGE_LIGHTBLUE.getId().getPath(),
			() -> new CeilingStageLightblueDisplayItem(FbmsModBlocks.CEILING_STAGE_LIGHTBLUE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CEILING_STAGE_LIGHT_ORANGE = REGISTRY.register(FbmsModBlocks.CEILING_STAGE_LIGHT_ORANGE.getId().getPath(),
			() -> new CeilingStageLightOrangeDisplayItem(FbmsModBlocks.CEILING_STAGE_LIGHT_ORANGE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NOVELTY_TRAFFIC_LIGHT = REGISTRY.register(FbmsModBlocks.NOVELTY_TRAFFIC_LIGHT.getId().getPath(),
			() -> new NoveltyTrafficLightDisplayItem(FbmsModBlocks.NOVELTY_TRAFFIC_LIGHT.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> R_FREDDY_POSTER = block(FbmsModBlocks.R_FREDDY_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> RBONNIE_POSTER = block(FbmsModBlocks.RBONNIE_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> R_CHICA_POSTER = block(FbmsModBlocks.R_CHICA_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> R_FOXY_POSTER = block(FbmsModBlocks.R_FOXY_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> LEFTY_POSTER = block(FbmsModBlocks.LEFTY_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MEGAULTIMATESPEAKERTRON_3000 = REGISTRY.register(FbmsModBlocks.MEGAULTIMATESPEAKERTRON_3000.getId().getPath(),
			() -> new Megaultimatespeakertron3000DisplayItem(FbmsModBlocks.MEGAULTIMATESPEAKERTRON_3000.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> HEAVY_DUITY_DOOR = REGISTRY.register(FbmsModBlocks.HEAVY_DUITY_DOOR.getId().getPath(),
			() -> new HeavyDuityDoorDisplayItem(FbmsModBlocks.HEAVY_DUITY_DOOR.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> STREAMER_FIZTIME = block(FbmsModBlocks.STREAMER_FIZTIME, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_1 = block(FbmsModBlocks.MONITOR_SCAI_1, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_2 = block(FbmsModBlocks.MONITOR_SCAI_2, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_3 = block(FbmsModBlocks.MONITOR_SCAI_3, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_4 = block(FbmsModBlocks.MONITOR_SCAI_4, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_5 = block(FbmsModBlocks.MONITOR_SCAI_5, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_6 = block(FbmsModBlocks.MONITOR_SCAI_6, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_7 = block(FbmsModBlocks.MONITOR_SCAI_7, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> MONITOR_SCAI_8 = block(FbmsModBlocks.MONITOR_SCAI_8, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> FREDBEAR_MURAL = block(FbmsModBlocks.FREDBEAR_MURAL, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> PIZZA_BOX_85_OPEN = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_85_OPEN.getId().getPath(),
			() -> new PizzaBox85OpenDisplayItem(FbmsModBlocks.PIZZA_BOX_85_OPEN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> PIZZA_BOX_87_OPEN = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_87_OPEN.getId().getPath(),
			() -> new PizzaBox87OpenDisplayItem(FbmsModBlocks.PIZZA_BOX_87_OPEN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> PIZZA_BOX_93_OPEN = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_93_OPEN.getId().getPath(),
			() -> new PizzaBox93OpenDisplayItem(FbmsModBlocks.PIZZA_BOX_93_OPEN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> PIZZA_BOX_24_OPEN = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_24_OPEN.getId().getPath(),
			() -> new PizzaBox24OpenDisplayItem(FbmsModBlocks.PIZZA_BOX_24_OPEN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_JUKE_BOX_OFF = REGISTRY.register(FbmsModBlocks.NEON_JUKE_BOX_OFF.getId().getPath(),
			() -> new NeonJukeBoxOffDisplayItem(FbmsModBlocks.NEON_JUKE_BOX_OFF.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CANDY_CADET = REGISTRY.register(FbmsModBlocks.CANDY_CADET.getId().getPath(), () -> new CandyCadetDisplayItem(FbmsModBlocks.CANDY_CADET.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BITE_FRED_BEAR_CUTOUT = REGISTRY.register(FbmsModBlocks.BITE_FRED_BEAR_CUTOUT.getId().getPath(),
			() -> new BiteFredBearCutoutDisplayItem(FbmsModBlocks.BITE_FRED_BEAR_CUTOUT.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> MOLDY_RABBIT = REGISTRY.register(FbmsModBlocks.MOLDY_RABBIT.getId().getPath(), () -> new MoldyRabbitDisplayItem(FbmsModBlocks.MOLDY_RABBIT.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> PAN_STAN = REGISTRY.register(FbmsModBlocks.PAN_STAN.getId().getPath(), () -> new PanStanDisplayItem(FbmsModBlocks.PAN_STAN.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BUCKET_BOB = REGISTRY.register(FbmsModBlocks.BUCKET_BOB.getId().getPath(), () -> new BucketBobDisplayItem(FbmsModBlocks.BUCKET_BOB.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> MR_CAN_DO = REGISTRY.register(FbmsModBlocks.MR_CAN_DO.getId().getPath(), () -> new MrCanDoDisplayItem(FbmsModBlocks.MR_CAN_DO.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> MR_HUGS = REGISTRY.register(FbmsModBlocks.MR_HUGS.getId().getPath(), () -> new MrHugsDisplayItem(FbmsModBlocks.MR_HUGS.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> NUMBER_1_CRATE = REGISTRY.register(FbmsModBlocks.NUMBER_1_CRATE.getId().getPath(), () -> new Number1CrateDisplayItem(FbmsModBlocks.NUMBER_1_CRATE.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BAGGY_MAGGIE = REGISTRY.register(FbmsModBlocks.BAGGY_MAGGIE.getId().getPath(), () -> new BaggyMaggieDisplayItem(FbmsModBlocks.BAGGY_MAGGIE.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> HAPPY_FROG = REGISTRY.register(FbmsModBlocks.HAPPY_FROG.getId().getPath(), () -> new HappyFrogDisplayItem(FbmsModBlocks.HAPPY_FROG.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> MR_HIPPO = REGISTRY.register(FbmsModBlocks.MR_HIPPO.getId().getPath(), () -> new MrHippoDisplayItem(FbmsModBlocks.MR_HIPPO.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> NEDD_BEAR = REGISTRY.register(FbmsModBlocks.NEDD_BEAR.getId().getPath(), () -> new NeddBearDisplayItem(FbmsModBlocks.NEDD_BEAR.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> PIG_PATCH = REGISTRY.register(FbmsModBlocks.PIG_PATCH.getId().getPath(), () -> new PigPatchDisplayItem(FbmsModBlocks.PIG_PATCH.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ROCK_STAR_BONNIE = REGISTRY.register(FbmsModBlocks.ROCK_STAR_BONNIE.getId().getPath(),
			() -> new RockStarBonnieDisplayItem(FbmsModBlocks.ROCK_STAR_BONNIE.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ROCK_STAR_CHICA = REGISTRY.register(FbmsModBlocks.ROCK_STAR_CHICA.getId().getPath(),
			() -> new RockStarChicaDisplayItem(FbmsModBlocks.ROCK_STAR_CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ROCK_STAR_FREDDY = REGISTRY.register(FbmsModBlocks.ROCK_STAR_FREDDY.getId().getPath(),
			() -> new RockStarFreddyDisplayItem(FbmsModBlocks.ROCK_STAR_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ROCK_STAR_FOXY = REGISTRY.register(FbmsModBlocks.ROCK_STAR_FOXY.getId().getPath(), () -> new RockStarFoxyDisplayItem(FbmsModBlocks.ROCK_STAR_FOXY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> LEFTY = REGISTRY.register(FbmsModBlocks.LEFTY.getId().getPath(), () -> new LeftyDisplayItem(FbmsModBlocks.LEFTY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ORVILLE = REGISTRY.register(FbmsModBlocks.ORVILLE.getId().getPath(), () -> new OrvilleDisplayItem(FbmsModBlocks.ORVILLE.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> SECURITY_PUPPET = REGISTRY.register(FbmsModBlocks.SECURITY_PUPPET.getId().getPath(),
			() -> new SecurityPuppetDisplayItem(FbmsModBlocks.SECURITY_PUPPET.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> PUPPET_BOX = REGISTRY.register(FbmsModBlocks.PUPPET_BOX.getId().getPath(), () -> new PuppetBoxDisplayItem(FbmsModBlocks.PUPPET_BOX.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> EL_CHIP = REGISTRY.register(FbmsModBlocks.EL_CHIP.getId().getPath(), () -> new ElChipDisplayItem(FbmsModBlocks.EL_CHIP.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> MUSIC_MAN = REGISTRY.register(FbmsModBlocks.MUSIC_MAN.getId().getPath(), () -> new MusicManDisplayItem(FbmsModBlocks.MUSIC_MAN.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> FUN_TIME_CHICA = REGISTRY.register(FbmsModBlocks.FUN_TIME_CHICA.getId().getPath(), () -> new FunTimeChicaDisplayItem(FbmsModBlocks.FUN_TIME_CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> PRIZE_KING = REGISTRY.register(FbmsModBlocks.PRIZE_KING.getId().getPath(), () -> new PrizeKingDisplayItem(FbmsModBlocks.PRIZE_KING.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> MOLTEN_FREDDY = REGISTRY.register(FbmsModBlocks.MOLTEN_FREDDY.getId().getPath(), () -> new MoltenFreddyDisplayItem(FbmsModBlocks.MOLTEN_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> MOLTEN_SIT = REGISTRY.register(FbmsModBlocks.MOLTEN_SIT.getId().getPath(), () -> new MoltenSitDisplayItem(FbmsModBlocks.MOLTEN_SIT.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> IGNITED_CHICA = REGISTRY.register(FbmsModBlocks.IGNITED_CHICA.getId().getPath(), () -> new IgnitedChicaDisplayItem(FbmsModBlocks.IGNITED_CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> THE_MANGLE = REGISTRY.register(FbmsModBlocks.THE_MANGLE.getId().getPath(), () -> new TheMangleDisplayItem(FbmsModBlocks.THE_MANGLE.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BARRY_POLAR_FIXED = REGISTRY.register(FbmsModBlocks.BARRY_POLAR_FIXED.getId().getPath(),
			() -> new BarryPolarFixedDisplayItem(FbmsModBlocks.BARRY_POLAR_FIXED.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BARRY_POLAR = REGISTRY.register(FbmsModBlocks.BARRY_POLAR.getId().getPath(), () -> new BarryPolarDisplayItem(FbmsModBlocks.BARRY_POLAR.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> FUNTIME_DELILAHBLOCK = REGISTRY.register(FbmsModBlocks.FUNTIME_DELILAHBLOCK.getId().getPath(),
			() -> new FuntimeDelilahblockDisplayItem(FbmsModBlocks.FUNTIME_DELILAHBLOCK.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> WALLY_WALRUS = REGISTRY.register(FbmsModBlocks.WALLY_WALRUS.getId().getPath(), () -> new WallyWalrusDisplayItem(FbmsModBlocks.WALLY_WALRUS.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> PUFFY_PUFFINS = REGISTRY.register(FbmsModBlocks.PUFFY_PUFFINS.getId().getPath(), () -> new PuffyPuffinsDisplayItem(FbmsModBlocks.PUFFY_PUFFINS.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> HAZY_REINDEER = REGISTRY.register(FbmsModBlocks.HAZY_REINDEER.getId().getPath(), () -> new HazyReindeerDisplayItem(FbmsModBlocks.HAZY_REINDEER.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> WITHERED_WALLY_WALRUS = REGISTRY.register(FbmsModBlocks.WITHERED_WALLY_WALRUS.getId().getPath(),
			() -> new WitheredWallyWalrusDisplayItem(FbmsModBlocks.WITHERED_WALLY_WALRUS.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> WITHERED_PUFFY_PUFFINS = REGISTRY.register(FbmsModBlocks.WITHERED_PUFFY_PUFFINS.getId().getPath(),
			() -> new WitheredPuffyPuffinsDisplayItem(FbmsModBlocks.WITHERED_PUFFY_PUFFINS.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> WITHERED_HAZY_REINDEER = REGISTRY.register(FbmsModBlocks.WITHERED_HAZY_REINDEER.getId().getPath(),
			() -> new WitheredHazyReindeerDisplayItem(FbmsModBlocks.WITHERED_HAZY_REINDEER.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> GT_ENDO = REGISTRY.register(FbmsModBlocks.GT_ENDO.getId().getPath(), () -> new GtEndoDisplayItem(FbmsModBlocks.GT_ENDO.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ST_ENDO = REGISTRY.register(FbmsModBlocks.ST_ENDO.getId().getPath(), () -> new StEndoDisplayItem(FbmsModBlocks.ST_ENDO.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BUFFET_ENDO = REGISTRY.register(FbmsModBlocks.BUFFET_ENDO.getId().getPath(), () -> new BuffetEndoDisplayItem(FbmsModBlocks.BUFFET_ENDO.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> DR_TEATH = REGISTRY.register(FbmsModBlocks.DR_TEATH.getId().getPath(), () -> new DrTeathDisplayItem(FbmsModBlocks.DR_TEATH.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> RUSTY = REGISTRY.register(FbmsModBlocks.RUSTY.getId().getPath(), () -> new RustyDisplayItem(FbmsModBlocks.RUSTY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> WINK_SIGN = REGISTRY.register(FbmsModBlocks.WINK_SIGN.getId().getPath(), () -> new WinkSignDisplayItem(FbmsModBlocks.WINK_SIGN.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> SCRAP_TRAP = REGISTRY.register(FbmsModBlocks.SCRAP_TRAP.getId().getPath(), () -> new ScrapTrapDisplayItem(FbmsModBlocks.SCRAP_TRAP.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BALLOON_BOY = REGISTRY.register(FbmsModBlocks.BALLOON_BOY.getId().getPath(), () -> new BalloonBoyDisplayItem(FbmsModBlocks.BALLOON_BOY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BON_BON = REGISTRY.register(FbmsModBlocks.BON_BON.getId().getPath(), () -> new BonBonDisplayItem(FbmsModBlocks.BON_BON.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BONNET = REGISTRY.register(FbmsModBlocks.BONNET.getId().getPath(), () -> new BonnetDisplayItem(FbmsModBlocks.BONNET.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> FT_FOXY = REGISTRY.register(FbmsModBlocks.FT_FOXY.getId().getPath(), () -> new FtFoxyDisplayItem(FbmsModBlocks.FT_FOXY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> LOL_BIT = REGISTRY.register(FbmsModBlocks.LOL_BIT.getId().getPath(), () -> new LolBitDisplayItem(FbmsModBlocks.LOL_BIT.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> LOL_BIT_DT = REGISTRY.register(FbmsModBlocks.LOL_BIT_DT.getId().getPath(), () -> new LolBitDtDisplayItem(FbmsModBlocks.LOL_BIT_DT.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> RETRO_CHICA = REGISTRY.register(FbmsModBlocks.RETRO_CHICA.getId().getPath(), () -> new RetroChicaDisplayItem(FbmsModBlocks.RETRO_CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> FREDDY_FAZ_BEAR = REGISTRY.register(FbmsModBlocks.FREDDY_FAZ_BEAR.getId().getPath(),
			() -> new FreddyFazBearDisplayItem(FbmsModBlocks.FREDDY_FAZ_BEAR.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> BONNIE = REGISTRY.register(FbmsModBlocks.BONNIE.getId().getPath(), () -> new BonnieDisplayItem(FbmsModBlocks.BONNIE.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> CHICA = REGISTRY.register(FbmsModBlocks.CHICA.getId().getPath(), () -> new ChicaDisplayItem(FbmsModBlocks.CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> FOXY = REGISTRY.register(FbmsModBlocks.FOXY.getId().getPath(), () -> new FoxyDisplayItem(FbmsModBlocks.FOXY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ENDO_01 = REGISTRY.register(FbmsModBlocks.ENDO_01.getId().getPath(), () -> new Endo01DisplayItem(FbmsModBlocks.ENDO_01.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> TOY_FREDDY = REGISTRY.register(FbmsModBlocks.TOY_FREDDY.getId().getPath(), () -> new ToyFreddyDisplayItem(FbmsModBlocks.TOY_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> TOY_BONNIE = REGISTRY.register(FbmsModBlocks.TOY_BONNIE.getId().getPath(), () -> new ToyBonnieDisplayItem(FbmsModBlocks.TOY_BONNIE.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> TOY_CHICA = REGISTRY.register(FbmsModBlocks.TOY_CHICA.getId().getPath(), () -> new ToyChicaDisplayItem(FbmsModBlocks.TOY_CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> TOY_FOXY = REGISTRY.register(FbmsModBlocks.TOY_FOXY.getId().getPath(), () -> new ToyFoxyDisplayItem(FbmsModBlocks.TOY_FOXY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> ENDO_02 = REGISTRY.register(FbmsModBlocks.ENDO_02.getId().getPath(), () -> new Endo02DisplayItem(FbmsModBlocks.ENDO_02.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> DOUG_THE_DOG = REGISTRY.register(FbmsModBlocks.DOUG_THE_DOG.getId().getPath(), () -> new DougTheDogDisplayItem(FbmsModBlocks.DOUG_THE_DOG.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> WITHERED_DOUG_THE_DOG = REGISTRY.register(FbmsModBlocks.WITHERED_DOUG_THE_DOG.getId().getPath(),
			() -> new WitheredDougTheDogDisplayItem(FbmsModBlocks.WITHERED_DOUG_THE_DOG.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> LOL_BIT_409 = REGISTRY.register(FbmsModBlocks.LOL_BIT_409.getId().getPath(), () -> new LolBit409DisplayItem(FbmsModBlocks.LOL_BIT_409.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> JOLLY_THE_RAT = REGISTRY.register(FbmsModBlocks.JOLLY_THE_RAT.getId().getPath(), () -> new JollyTheRatDisplayItem(FbmsModBlocks.JOLLY_THE_RAT.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> SALVAGED_JOLLY = REGISTRY.register(FbmsModBlocks.SALVAGED_JOLLY.getId().getPath(), () -> new SalvagedJollyDisplayItem(FbmsModBlocks.SALVAGED_JOLLY.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> CHICA_O_LANTERN = block(FbmsModBlocks.CHICA_O_LANTERN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILES = block(FbmsModBlocks.BLACK_WHITE_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_RED_TILES = block(FbmsModBlocks.BLACK_RED_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLUE_WHITE_TILES = block(FbmsModBlocks.BLUE_WHITE_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> FULL_WHITE_TILES = block(FbmsModBlocks.FULL_WHITE_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILES = block(FbmsModBlocks.RED_WHITE_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> FULL_BLACK_TILES = block(FbmsModBlocks.FULL_BLACK_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_BLUE_TILES = block(FbmsModBlocks.BLACK_BLUE_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILES = block(FbmsModBlocks.RED_BLUE_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILES_SLAB = block(FbmsModBlocks.BLACK_WHITE_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_RED_TILES_SLAB = block(FbmsModBlocks.BLACK_RED_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLUE_WHITE_TILES_SLAB = block(FbmsModBlocks.BLUE_WHITE_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> FULL_WHITE_TILES_SLAB = block(FbmsModBlocks.FULL_WHITE_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILES_SLAB = block(FbmsModBlocks.RED_WHITE_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> FULL_BLACK_TILES_SLAB = block(FbmsModBlocks.FULL_BLACK_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_BLUE_TILES_SLAB = block(FbmsModBlocks.BLACK_BLUE_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILES_SLAB = block(FbmsModBlocks.RED_BLUE_TILES_SLAB, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILES_STAIRS = block(FbmsModBlocks.BLACK_WHITE_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_RED_TILES_STAIRS = block(FbmsModBlocks.BLACK_RED_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLUE_WHITE_TILES_STAIRS = block(FbmsModBlocks.BLUE_WHITE_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> FULL_WHITE_TILES_STAIRS = block(FbmsModBlocks.FULL_WHITE_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILES_STAIRS = block(FbmsModBlocks.RED_WHITE_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> FULL_BLACK_TILES_STAIRS = block(FbmsModBlocks.FULL_BLACK_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_BLUE_TILES_STAIRS = block(FbmsModBlocks.BLACK_BLUE_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILES_STAIRS = block(FbmsModBlocks.RED_BLUE_TILES_STAIRS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LARGE_BLACK_WHITE_TILES = block(FbmsModBlocks.LARGE_BLACK_WHITE_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BOX = block(FbmsModBlocks.BOX, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BRANDED_BOX = block(FbmsModBlocks.BRANDED_BOX, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_WALL = block(FbmsModBlocks.RED_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> POSH_WALL_TILES = block(FbmsModBlocks.POSH_WALL_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> ORANGE_WALL = block(FbmsModBlocks.ORANGE_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_WALL_TOP = block(FbmsModBlocks.RED_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> YELLOW_WALLS = block(FbmsModBlocks.YELLOW_WALLS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIME_WALL = block(FbmsModBlocks.LIME_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GREEN_WALL = block(FbmsModBlocks.GREEN_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> CYAN_WALL = block(FbmsModBlocks.CYAN_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_BLUE_WALL = block(FbmsModBlocks.LIGHT_BLUE_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLUE_WALL = block(FbmsModBlocks.BLUE_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PURPLE_WALL = block(FbmsModBlocks.PURPLE_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> MAGENTA_WALL = block(FbmsModBlocks.MAGENTA_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PINK_WALL = block(FbmsModBlocks.PINK_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GRAY_WALL = block(FbmsModBlocks.GRAY_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> DARK_GRAY_WALL = block(FbmsModBlocks.DARK_GRAY_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> WHITE_WALL = block(FbmsModBlocks.WHITE_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_WALL = block(FbmsModBlocks.BLACK_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_CURTAIN = block(FbmsModBlocks.RED_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_RED_CURTAIN = block(FbmsModBlocks.THIN_RED_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> ORANGE_CURTAIN = block(FbmsModBlocks.ORANGE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_ORANGE_CURTAIN = block(FbmsModBlocks.THIN_ORANGE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> YELLOW_CURTAIN = block(FbmsModBlocks.YELLOW_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_YELLOW_CURTAIN = block(FbmsModBlocks.THIN_YELLOW_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIME_CURTAIN = block(FbmsModBlocks.LIME_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_LIME_CURTAIN = block(FbmsModBlocks.THIN_LIME_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GREEN_CURTAIN = block(FbmsModBlocks.GREEN_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_GREEN_CURTAIN = block(FbmsModBlocks.THIN_GREEN_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> CYAN_CURTAIN = block(FbmsModBlocks.CYAN_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_CYAN_CURTAIN = block(FbmsModBlocks.THIN_CYAN_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_BLUE_CURTAIN = block(FbmsModBlocks.LIGHT_BLUE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_LIGHT_BLUE_CURTAIN = block(FbmsModBlocks.THIN_LIGHT_BLUE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLUE_CURTAIN = block(FbmsModBlocks.BLUE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_BLUE_CURTAIN = block(FbmsModBlocks.THIN_BLUE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PURPLE_CURTAIN = block(FbmsModBlocks.PURPLE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_PURPLE_CURTAIN = block(FbmsModBlocks.THIN_PURPLE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> MAGENTA_CURTAIN = block(FbmsModBlocks.MAGENTA_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_MAGENTA_CURTAIN = block(FbmsModBlocks.THIN_MAGENTA_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PINK_CURTAIN = block(FbmsModBlocks.PINK_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_PINK_CURTAIN = block(FbmsModBlocks.THIN_PINK_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BROWN_CURTAIN = block(FbmsModBlocks.BROWN_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_BROWN_CURTAIN = block(FbmsModBlocks.THIN_BROWN_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_CURTAIN = block(FbmsModBlocks.BLACK_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_BLACK_CURTAIN = block(FbmsModBlocks.THIN_BLACK_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GRAY_CURTAIN = block(FbmsModBlocks.GRAY_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_GRAY_CURTAIN = block(FbmsModBlocks.THIN_GRAY_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_GRAY_CURTAIN = block(FbmsModBlocks.LIGHT_GRAY_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_LIGHT_GRAY_CURTAIN = block(FbmsModBlocks.THIN_LIGHT_GRAY_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> WHITE_CURTAIN = block(FbmsModBlocks.WHITE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> THIN_WHITE_CURTAIN = block(FbmsModBlocks.THIN_WHITE_CURTAIN, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RED_STAGE_BRICKS = block(FbmsModBlocks.RED_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> ORANGE_STAGE_BRICKS = block(FbmsModBlocks.ORANGE_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> YELLOW_STAGE_BRICKS = block(FbmsModBlocks.YELLOW_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIME_STAGE_BRICKS = block(FbmsModBlocks.LIME_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GREEN_STAGE_BRICKS = block(FbmsModBlocks.GREEN_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> CYAN_STAGE_BRICKS = block(FbmsModBlocks.CYAN_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLUE_STAGE_BRICKS = block(FbmsModBlocks.BLUE_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PURPLE_STAGE_BRICKS = block(FbmsModBlocks.PURPLE_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> MAGENTA_STAGE_BRICKS = block(FbmsModBlocks.MAGENTA_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PINK_STAGE_BRICKS = block(FbmsModBlocks.PINK_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BROWN_STAGE_BRICKS = block(FbmsModBlocks.BROWN_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_GRAY_BRICKS = block(FbmsModBlocks.LIGHT_GRAY_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GRAY_STAGE_BRICKS = block(FbmsModBlocks.GRAY_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> WHITE_STAGE_BRICKS = block(FbmsModBlocks.WHITE_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLACK_STAGE_BRICKS = block(FbmsModBlocks.BLACK_STAGE_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> CEILING_TILES = block(FbmsModBlocks.CEILING_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> CEILING_LIGHT = block(FbmsModBlocks.CEILING_LIGHT, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GLASS_OFFICE_DOOR = doubleBlock(FbmsModBlocks.GLASS_OFFICE_DOOR, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GLASS_OFFICE_DOOR_TEXT = doubleBlock(FbmsModBlocks.GLASS_OFFICE_DOOR_TEXT, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GLASS_DOOR = doubleBlock(FbmsModBlocks.GLASS_DOOR, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLANK_STAFF_DOOR = doubleBlock(FbmsModBlocks.BLANK_STAFF_DOOR, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> STAFF_DOOR = doubleBlock(FbmsModBlocks.STAFF_DOOR, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> WHITE_STAFF_DOOR = doubleBlock(FbmsModBlocks.WHITE_STAFF_DOOR, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> STALL_DOOR = doubleBlock(FbmsModBlocks.STALL_DOOR, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LARGE_SIGN = REGISTRY.register(FbmsModBlocks.LARGE_SIGN.getId().getPath(), () -> new LargeSignDisplayItem(FbmsModBlocks.LARGE_SIGN.get(), new Item.Properties().tab(FbmsModTabs.TAB_A_DS)));
	public static final RegistryObject<Item> LARGE_SIGN_2 = REGISTRY.register(FbmsModBlocks.LARGE_SIGN_2.getId().getPath(), () -> new LargeSign2DisplayItem(FbmsModBlocks.LARGE_SIGN_2.get(), new Item.Properties().tab(FbmsModTabs.TAB_A_DS)));
	public static final RegistryObject<Item> LARGE_SIGN_3 = REGISTRY.register(FbmsModBlocks.LARGE_SIGN_3.getId().getPath(), () -> new LargeSign3DisplayItem(FbmsModBlocks.LARGE_SIGN_3.get(), new Item.Properties().tab(FbmsModTabs.TAB_A_DS)));
	public static final RegistryObject<Item> LARGE_SIGN_4 = REGISTRY.register(FbmsModBlocks.LARGE_SIGN_4.getId().getPath(), () -> new LargeSign4DisplayItem(FbmsModBlocks.LARGE_SIGN_4.get(), new Item.Properties().tab(FbmsModTabs.TAB_A_DS)));
	public static final RegistryObject<Item> TRUMPET = REGISTRY.register("trumpet", () -> new TrumpetItem());
	public static final RegistryObject<Item> BANJO = REGISTRY.register("banjo", () -> new BanjoItem());
	public static final RegistryObject<Item> MARACAS = REGISTRY.register("maracas", () -> new MaracasItem());
	public static final RegistryObject<Item> ACCORDION = REGISTRY.register("accordion", () -> new AccordionItem());
	public static final RegistryObject<Item> MANDOLIN = REGISTRY.register("mandolin", () -> new MandolinItem());
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());
	public static final RegistryObject<Item> TOY_MIC = REGISTRY.register("toy_mic", () -> new ToyMicItem());
	public static final RegistryObject<Item> GUITAR = REGISTRY.register("guitar", () -> new GuitarItem());
	public static final RegistryObject<Item> COIN = REGISTRY.register(FbmsModBlocks.COIN.getId().getPath(), () -> new CoinDisplayItem(FbmsModBlocks.COIN.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_5 = REGISTRY.register(FbmsModBlocks.COINS_5.getId().getPath(), () -> new Coins5DisplayItem(FbmsModBlocks.COINS_5.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_100 = REGISTRY.register(FbmsModBlocks.COINS_100.getId().getPath(), () -> new Coins25DisplayItem(FbmsModBlocks.COINS_100.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_25 = REGISTRY.register(FbmsModBlocks.COINS_25.getId().getPath(), () -> new Coins100DisplayItem(FbmsModBlocks.COINS_25.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_1000 = REGISTRY.register(FbmsModBlocks.COINS_1000.getId().getPath(), () -> new Coins1000DisplayItem(FbmsModBlocks.COINS_1000.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_10000 = REGISTRY.register(FbmsModBlocks.COINS_10000.getId().getPath(), () -> new Coins10000DisplayItem(FbmsModBlocks.COINS_10000.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> CUP_FIZTIME_1 = REGISTRY.register("cup_fiztime_1", () -> new CupFiztime1Item());
	public static final RegistryObject<Item> CUP_FIZTIME_2 = REGISTRY.register("cup_fiztime_2", () -> new CupFiztime2Item());
	public static final RegistryObject<Item> PIZZA = REGISTRY.register("pizza", () -> new PizzaItem());
	public static final RegistryObject<Item> HOT_DOG = REGISTRY.register("hot_dog", () -> new HotDogItem());
	public static final RegistryObject<Item> CHEESE_PIZZA = REGISTRY.register("cheese_pizza", () -> new CheesePizzaItem());
	public static final RegistryObject<Item> CPU = REGISTRY.register("cpu", () -> new CpuItem());
	public static final RegistryObject<Item> COINS = REGISTRY.register("coins", () -> new CoinsItem());
	public static final RegistryObject<Item> FRIES = REGISTRY.register("fries", () -> new FriesItem());
	public static final RegistryObject<Item> MOLDY_PIZZA = REGISTRY.register("moldy_pizza", () -> new MoldyPizzaItem());
	public static final RegistryObject<Item> MOLDY_HOT_DOG = REGISTRY.register("moldy_hot_dog", () -> new MoldyHotDogItem());
	public static final RegistryObject<Item> MOLDY_FRIES = REGISTRY.register("moldy_fries", () -> new MoldyFriesItem());
	public static final RegistryObject<Item> GOLDEN_BITE = REGISTRY.register("golden_bite", () -> new GoldenBiteItem());
	public static final RegistryObject<Item> MOLDY_CHEESE_PIZZA = REGISTRY.register("moldy_cheese_pizza", () -> new MoldyCheesePizzaItem());
	public static final RegistryObject<Item> FRIED_CHICKEN = REGISTRY.register("fried_chicken", () -> new FriedChickenItem());
	public static final RegistryObject<Item> MOLDY_FRIED_CHICKEN = REGISTRY.register("moldy_fried_chicken", () -> new MoldyFriedChickenItem());
	public static final RegistryObject<Item> IMPALA_SPAWN_EGG = REGISTRY.register("impala_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.IMPALA, -6750055, -10092442, new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> IMPALA_BLOCK = REGISTRY.register(FbmsModBlocks.IMPALA_BLOCK.getId().getPath(), () -> new ImpalaBlockDisplayItem(FbmsModBlocks.IMPALA_BLOCK.get(), new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> DOGE_RAM_SPAWN_EGG = REGISTRY.register("doge_ram_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.DOGE_RAM, -13434625, -16777012, new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> DOGE_RAM_BLOCK = REGISTRY.register(FbmsModBlocks.DOGE_RAM_BLOCK.getId().getPath(), () -> new DogeRamBlockDisplayItem(FbmsModBlocks.DOGE_RAM_BLOCK.get(), new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> STATION_WAGON_SPAWN_EGG = REGISTRY.register("station_wagon_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.STATION_WAGON, -6724096, -3381760, new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> STATION_WAGON_BLOCK = REGISTRY.register(FbmsModBlocks.STATION_WAGON_BLOCK.getId().getPath(),
			() -> new StationWagonBlockDisplayItem(FbmsModBlocks.STATION_WAGON_BLOCK.get(), new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> D_FREDDY_SPAWN_EGG = REGISTRY.register("d_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.D_FREDDY, -11390428, -6724536, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> OLD_BONNIE = REGISTRY.register(FbmsModBlocks.OLD_BONNIE.getId().getPath(), () -> new OldBonnieDisplayItem(FbmsModBlocks.OLD_BONNIE.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> D_BONNIE_SPAWN_EGG = REGISTRY.register("d_bonnie_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.D_BONNIE, -1, -1, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> DCHICA_SPAWN_EGG = REGISTRY.register("dchica_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.DCHICA, -1, -1, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> D_FOXY_SPAWN_EGG = REGISTRY.register("d_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.D_FOXY, -1, -1, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> DFREDBEAR_SPAWN_EGG = REGISTRY.register("dfredbear_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.DFREDBEAR, -1, -1, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> D_MANGLE_SPAWN_EGG = REGISTRY.register("d_mangle_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.D_MANGLE, -1, -1, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> OLD_FREDDY = REGISTRY.register(FbmsModBlocks.OLD_FREDDY.getId().getPath(), () -> new OldFreddyDisplayItem(FbmsModBlocks.OLD_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> OLD_CHICA = REGISTRY.register(FbmsModBlocks.OLD_CHICA.getId().getPath(), () -> new OldChicaDisplayItem(FbmsModBlocks.OLD_CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> OLD_FOXY = REGISTRY.register(FbmsModBlocks.OLD_FOXY.getId().getPath(), () -> new OldFoxyDisplayItem(FbmsModBlocks.OLD_FOXY.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> D_BALLOON_BOY = REGISTRY.register(FbmsModBlocks.D_BALLOON_BOY.getId().getPath(),
			() -> new DBalloonBoyDisplayItem(FbmsModBlocks.D_BALLOON_BOY.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> REMOTE = REGISTRY.register("remote", () -> new RemoteItem());
	public static final RegistryObject<Item> BROKEN_FREDDY = REGISTRY.register(FbmsModBlocks.BROKEN_FREDDY.getId().getPath(),
			() -> new BrokenFreddyDisplayItem(FbmsModBlocks.BROKEN_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> BROKEN_BONNIE = REGISTRY.register(FbmsModBlocks.BROKEN_BONNIE.getId().getPath(),
			() -> new BrokenBonnieDisplayItem(FbmsModBlocks.BROKEN_BONNIE.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> BROKEN_CHICA = REGISTRY.register(FbmsModBlocks.BROKEN_CHICA.getId().getPath(), () -> new BrokenChicaDisplayItem(FbmsModBlocks.BROKEN_CHICA.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> RASC = REGISTRY.register(FbmsModBlocks.RASC.getId().getPath(), () -> new RascDisplayItem(FbmsModBlocks.RASC.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> SHRED_BEAR = REGISTRY.register(FbmsModBlocks.SHRED_BEAR.getId().getPath(), () -> new ShredBearDisplayItem(FbmsModBlocks.SHRED_BEAR.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> FAT = REGISTRY.register("fat", () -> new FATItem());
	public static final RegistryObject<Item> ROTTEN_PIT = REGISTRY.register(FbmsModBlocks.ROTTEN_PIT.getId().getPath(), () -> new RottenPitDisplayItem(FbmsModBlocks.ROTTEN_PIT.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> FRIGHTS_SIGN_2 = REGISTRY.register(FbmsModBlocks.FRIGHTS_SIGN_2.getId().getPath(),
			() -> new FrightsSign2DisplayItem(FbmsModBlocks.FRIGHTS_SIGN_2.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> PIZZA_PLACE_SIGN = REGISTRY.register(FbmsModBlocks.PIZZA_PLACE_SIGN.getId().getPath(),
			() -> new PizzaPlaceSignDisplayItem(FbmsModBlocks.PIZZA_PLACE_SIGN.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> PIZZA_PLACE_SIGN_OLD = REGISTRY.register(FbmsModBlocks.PIZZA_PLACE_SIGN_OLD.getId().getPath(),
			() -> new PizzaPlaceSignOldDisplayItem(FbmsModBlocks.PIZZA_PLACE_SIGN_OLD.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> JEFFS_PIZZA_SIGN = REGISTRY.register(FbmsModBlocks.JEFFS_PIZZA_SIGN.getId().getPath(),
			() -> new JeffsPizzaSignDisplayItem(FbmsModBlocks.JEFFS_PIZZA_SIGN.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> LOLBIT_RECORD = REGISTRY.register(FbmsModBlocks.LOLBIT_RECORD.getId().getPath(),
			() -> new LolbitRecordDisplayItem(FbmsModBlocks.LOLBIT_RECORD.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> SIGN_DDW = REGISTRY.register(FbmsModBlocks.SIGN_DDW.getId().getPath(), () -> new SignDDWDisplayItem(FbmsModBlocks.SIGN_DDW.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> SIGN_SBT = REGISTRY.register(FbmsModBlocks.SIGN_SBT.getId().getPath(), () -> new SignSBTDisplayItem(FbmsModBlocks.SIGN_SBT.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> SIGN_RFA = REGISTRY.register(FbmsModBlocks.SIGN_RFA.getId().getPath(), () -> new SignRFADisplayItem(FbmsModBlocks.SIGN_RFA.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> SIGN_SNS = REGISTRY.register(FbmsModBlocks.SIGN_SNS.getId().getPath(), () -> new SignSNSDisplayItem(FbmsModBlocks.SIGN_SNS.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> TV_OFF = block(FbmsModBlocks.TV_OFF, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> MONITOR_OFF = block(FbmsModBlocks.MONITOR_OFF, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> MONITOR_WORK = block(FbmsModBlocks.MONITOR_WORK, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> MONITOR_LOLBIT = block(FbmsModBlocks.MONITOR_LOLBIT, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> MONITOR_STEPHAN = block(FbmsModBlocks.MONITOR_STEPHAN, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> MONITOR_BLUESCREEN = block(FbmsModBlocks.MONITOR_BLUESCREEN, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> SIGN_MS = REGISTRY.register(FbmsModBlocks.SIGN_MS.getId().getPath(), () -> new SignMSDisplayItem(FbmsModBlocks.SIGN_MS.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<GasMaskItem> GAS_MASK_HELMET = REGISTRY.register("gas_mask_helmet", () -> new GasMaskItem(EquipmentSlot.HEAD, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));

	public static final RegistryObject<Item> HAZMAT_SUIT_CHESTPLATE = REGISTRY.register("hazmat_suit_chestplate", () -> new HazmatSuitItem.Chestplate());
	public static final RegistryObject<Item> HAZMAT_SUIT_LEGGINGS = REGISTRY.register("hazmat_suit_leggings", () -> new HazmatSuitItem.Leggings());
	public static final RegistryObject<Item> SAFETY_POSTER = block(FbmsModBlocks.SAFETY_POSTER, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> SAFETY_POSTER_FREDDY = block(FbmsModBlocks.SAFETY_POSTER_FREDDY, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> SAFETY_POSTER_BONNIE = block(FbmsModBlocks.SAFETY_POSTER_BONNIE, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> SAFETY_POSTER_CHICA = block(FbmsModBlocks.SAFETY_POSTER_CHICA, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> SAFETY_POSTER_FOXY = block(FbmsModBlocks.SAFETY_POSTER_FOXY, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> CELEBRATE_POSTER = block(FbmsModBlocks.CELEBRATE_POSTER, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> GLASSES_HELMET = REGISTRY.register("glasses_helmet", () -> new GlassesItem.Helmet());
	public static final RegistryObject<Item> PROJECTOR = REGISTRY.register(FbmsModBlocks.PROJECTOR.getId().getPath(), () -> new ProjectorDisplayItem(FbmsModBlocks.PROJECTOR.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> CAM = REGISTRY.register(FbmsModBlocks.CAM.getId().getPath(), () -> new CamDisplayItem(FbmsModBlocks.CAM.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> FREDDY_CUT_OUT = REGISTRY.register(FbmsModBlocks.FREDDY_CUT_OUT.getId().getPath(),
			() -> new FreddyCutOutDisplayItem(FbmsModBlocks.FREDDY_CUT_OUT.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> BONNIE_CUT_OUT = REGISTRY.register(FbmsModBlocks.BONNIE_CUT_OUT.getId().getPath(),
			() -> new BonnieCutOutDisplayItem(FbmsModBlocks.BONNIE_CUT_OUT.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> CHICA_CUT_OUT = REGISTRY.register(FbmsModBlocks.CHICA_CUT_OUT.getId().getPath(),
			() -> new ChicaCutOutDisplayItem(FbmsModBlocks.CHICA_CUT_OUT.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> HELPY_CUT_OUT = REGISTRY.register(FbmsModBlocks.HELPY_CUT_OUT.getId().getPath(),
			() -> new HelpyCutOutDisplayItem(FbmsModBlocks.HELPY_CUT_OUT.get(), new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
	public static final RegistryObject<Item> FRED_BEAR_POSTER = block(FbmsModBlocks.FRED_BEAR_POSTER, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> FRED_BEAR_PIZZA_POSTER = block(FbmsModBlocks.FRED_BEAR_PIZZA_POSTER, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> SPRING_BONNIE_POSTER = block(FbmsModBlocks.SPRING_BONNIE_POSTER, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> DOC_PLUSH = REGISTRY.register(FbmsModBlocks.DOC_PLUSH.getId().getPath(), () -> new DocPlushDisplayItem(FbmsModBlocks.DOC_PLUSH.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> GARF_PLUSH = REGISTRY.register(FbmsModBlocks.GARF_PLUSH.getId().getPath(), () -> new GarfPlushDisplayItem(FbmsModBlocks.GARF_PLUSH.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> ROSEY = REGISTRY.register(FbmsModBlocks.ROSEY.getId().getPath(), () -> new RoseyDisplayItem(FbmsModBlocks.ROSEY.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> VESSEL = block(FbmsModBlocks.VESSEL, FbmsModTabs.TAB_PLUSH);
	public static final RegistryObject<Item> STEPHAN_PLUSH = REGISTRY.register(FbmsModBlocks.STEPHAN_PLUSH.getId().getPath(), () -> new StephanPlushDisplayItem(FbmsModBlocks.STEPHAN_PLUSH.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> DOLLS = REGISTRY.register(FbmsModBlocks.DOLLS.getId().getPath(), () -> new DollsDisplayItem(FbmsModBlocks.DOLLS.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> RAT_SPAWN_EGG = REGISTRY.register("rat_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.RAT, -6724096, -26113, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MYSTERIOUS_GIANT_SCUTTLERS_SPAWN_EGG = REGISTRY.register("mysterious_giant_scuttlers_spawn_egg",
			() -> new ForgeSpawnEggItem(FbmsModEntities.MYSTERIOUS_GIANT_SCUTTLERS, -6711040, -6724096, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BARRY_POLAR_ANIMATED = REGISTRY.register(FbmsModBlocks.BARRY_POLAR_ANIMATED.getId().getPath(),
			() -> new BarryPolarAnimatedDisplayItem(FbmsModBlocks.BARRY_POLAR_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> BROKEN_BARRY_POLAR_ANIMATED = REGISTRY.register(FbmsModBlocks.BROKEN_BARRY_POLAR_ANIMATED.getId().getPath(),
			() -> new BrokenBarryPolarAnimatedDisplayItem(FbmsModBlocks.BROKEN_BARRY_POLAR_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> AD = REGISTRY.register("ad", () -> new AdItem());
	public static final RegistryObject<Item> FUNTIME_DELILAH = REGISTRY.register(FbmsModBlocks.FUNTIME_DELILAH.getId().getPath(), () -> new FuntimeDelilahDisplayItem(FbmsModBlocks.FUNTIME_DELILAH.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> EL_CHIP_ANIMATED = REGISTRY.register(FbmsModBlocks.EL_CHIP_ANIMATED.getId().getPath(), () -> new ElChipAnimatedDisplayItem(FbmsModBlocks.EL_CHIP_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENDO_01_ANIMATED = REGISTRY.register(FbmsModBlocks.ENDO_01_ANIMATED.getId().getPath(), () -> new Endo01AnimatedDisplayItem(FbmsModBlocks.ENDO_01_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FUNTIME_CHICA_ANIMATED = REGISTRY.register(FbmsModBlocks.FUNTIME_CHICA_ANIMATED.getId().getPath(),
			() -> new FuntimeChicaAnimatedDisplayItem(FbmsModBlocks.FUNTIME_CHICA_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> HAPP_Y_FROG_ANIMATED = REGISTRY.register(FbmsModBlocks.HAPP_Y_FROG_ANIMATED.getId().getPath(),
			() -> new HappYFrogAnimatedDisplayItem(FbmsModBlocks.HAPP_Y_FROG_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> LEFTY_ANIMATED = REGISTRY.register(FbmsModBlocks.LEFTY_ANIMATED.getId().getPath(), () -> new LeftyAnimatedDisplayItem(FbmsModBlocks.LEFTY_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MR_HIPPO_ANIMATED = REGISTRY.register(FbmsModBlocks.MR_HIPPO_ANIMATED.getId().getPath(), () -> new MrHippoAnimatedDisplayItem(FbmsModBlocks.MR_HIPPO_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MUSIC_MAN_ANIMATED = REGISTRY.register(FbmsModBlocks.MUSIC_MAN_ANIMATED.getId().getPath(), () -> new MusicManAnimatedDisplayItem(FbmsModBlocks.MUSIC_MAN_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> NEDD_BEAR_ANIMATED = REGISTRY.register(FbmsModBlocks.NEDD_BEAR_ANIMATED.getId().getPath(), () -> new NeddBearAnimatedDisplayItem(FbmsModBlocks.NEDD_BEAR_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ORVILLE_ANIMATED = REGISTRY.register(FbmsModBlocks.ORVILLE_ANIMATED.getId().getPath(), () -> new OrvilleAnimatedDisplayItem(FbmsModBlocks.ORVILLE_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PIG_PATCH_ANIMATED = REGISTRY.register(FbmsModBlocks.PIG_PATCH_ANIMATED.getId().getPath(), () -> new PigPatchAnimatedDisplayItem(FbmsModBlocks.PIG_PATCH_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ROCK_STAR_BONNIE_ANIMATED = REGISTRY.register(FbmsModBlocks.ROCK_STAR_BONNIE_ANIMATED.getId().getPath(),
			() -> new RockStarBonnieAnimatedDisplayItem(FbmsModBlocks.ROCK_STAR_BONNIE_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ROCK_STAR_CHICA_ANIMATED = REGISTRY.register(FbmsModBlocks.ROCK_STAR_CHICA_ANIMATED.getId().getPath(),
			() -> new RockStarChicaAnimatedDisplayItem(FbmsModBlocks.ROCK_STAR_CHICA_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ROCK_STAR_FOXY_ANIMATED = REGISTRY.register(FbmsModBlocks.ROCK_STAR_FOXY_ANIMATED.getId().getPath(),
			() -> new RockStarFoxyAnimatedDisplayItem(FbmsModBlocks.ROCK_STAR_FOXY_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ROCK_STAR_FREDDY_ANIMATED = REGISTRY.register(FbmsModBlocks.ROCK_STAR_FREDDY_ANIMATED.getId().getPath(),
			() -> new RockStarFreddyAnimatedDisplayItem(FbmsModBlocks.ROCK_STAR_FREDDY_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> RUSTY_ANIMATED = REGISTRY.register(FbmsModBlocks.RUSTY_ANIMATED.getId().getPath(), () -> new RustyAnimatedDisplayItem(FbmsModBlocks.RUSTY_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> NEON_JUKE_BOX = REGISTRY.register(FbmsModBlocks.NEON_JUKE_BOX.getId().getPath(), () -> new NeonJukeBoxDisplayItem(FbmsModBlocks.NEON_JUKE_BOX.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> GRAVITY_VORTEX = REGISTRY.register(FbmsModBlocks.GRAVITY_VORTEX.getId().getPath(), () -> new GravityVortexDisplayItem(FbmsModBlocks.GRAVITY_VORTEX.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SEAT_SPAWN_EGG = REGISTRY.register("seat_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.SEAT, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FRIGHTS_SIGN = REGISTRY.register(FbmsModBlocks.FRIGHTS_SIGN.getId().getPath(), () -> new FrightsSignDisplayItem(FbmsModBlocks.FRIGHTS_SIGN.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> HAZY_REINDEER_ANIMATED = REGISTRY.register(FbmsModBlocks.HAZY_REINDEER_ANIMATED.getId().getPath(),
			() -> new HazyReindeerAnimatedDisplayItem(FbmsModBlocks.HAZY_REINDEER_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> WALLY_WALRUS_ANIMATED = REGISTRY.register(FbmsModBlocks.WALLY_WALRUS_ANIMATED.getId().getPath(),
			() -> new WallyWalrusAnimatedDisplayItem(FbmsModBlocks.WALLY_WALRUS_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PUFFY_PUFFINS_ANIMATED = REGISTRY.register(FbmsModBlocks.PUFFY_PUFFINS_ANIMATED.getId().getPath(),
			() -> new PuffyPuffinsAnimatedDisplayItem(FbmsModBlocks.PUFFY_PUFFINS_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> GT_ENDO_ANIMATED = REGISTRY.register(FbmsModBlocks.GT_ENDO_ANIMATED.getId().getPath(), () -> new GtEndoAnimatedDisplayItem(FbmsModBlocks.GT_ENDO_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ST_ENDO_ANIMATED = REGISTRY.register(FbmsModBlocks.ST_ENDO_ANIMATED.getId().getPath(), () -> new StEndoAnimatedDisplayItem(FbmsModBlocks.ST_ENDO_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> HEAVY_DUITY_DOOR_CLOSED = REGISTRY.register(FbmsModBlocks.HEAVY_DUITY_DOOR_CLOSED.getId().getPath(),
			() -> new HeavyDuityDoorClosedDisplayItem(FbmsModBlocks.HEAVY_DUITY_DOOR_CLOSED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> RETRO_CHICA_ANIMATED = REGISTRY.register(FbmsModBlocks.RETRO_CHICA_ANIMATED.getId().getPath(),
			() -> new RetroChicaAnimatedDisplayItem(FbmsModBlocks.RETRO_CHICA_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> JOLLY_THE_RAT_ANIMATED = REGISTRY.register(FbmsModBlocks.JOLLY_THE_RAT_ANIMATED.getId().getPath(),
			() -> new JollyTheRatAnimatedDisplayItem(FbmsModBlocks.JOLLY_THE_RAT_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TV_FIZTIME_POP_SODA = block(FbmsModBlocks.TV_FIZTIME_POP_SODA, null);
	public static final RegistryObject<Item> TV_FLOS_GLOSSY_FLOSS = block(FbmsModBlocks.TV_FLOS_GLOSSY_FLOSS, null);
	public static final RegistryObject<Item> TV_FREDDY_AND_FRIENDS = block(FbmsModBlocks.TV_FREDDY_AND_FRIENDS, null);
	public static final RegistryObject<Item> TV_GARFIELD_SHOW = block(FbmsModBlocks.TV_GARFIELD_SHOW, null);
	public static final RegistryObject<Item> TV_IATR = block(FbmsModBlocks.TV_IATR, null);
	public static final RegistryObject<Item> TV_LALLIES_LOLLIES = block(FbmsModBlocks.TV_LALLIES_LOLLIES, null);
	public static final RegistryObject<Item> TV_MARTIES_PLUNGERS = block(FbmsModBlocks.TV_MARTIES_PLUNGERS, null);
	public static final RegistryObject<Item> TV_NEWS = block(FbmsModBlocks.TV_NEWS, null);
	public static final RegistryObject<Item> TV_PEPPERS_PICKLED_POPCORN = block(FbmsModBlocks.TV_PEPPERS_PICKLED_POPCORN, null);
	public static final RegistryObject<Item> TV_WACKY_WART_PASTE = block(FbmsModBlocks.TV_WACKY_WART_PASTE, null);
	public static final RegistryObject<Item> TV_MARCELO = block(FbmsModBlocks.TV_MARCELO, null);
	public static final RegistryObject<Item> TV_DOUG = block(FbmsModBlocks.TV_DOUG, null);
	public static final RegistryObject<Item> TV_SCREAM = block(FbmsModBlocks.TV_SCREAM, null);
	public static final RegistryObject<Item> TV_JAWS = block(FbmsModBlocks.TV_JAWS, null);
	public static final RegistryObject<Item> TV_KILLER_KLOWNS = block(FbmsModBlocks.TV_KILLER_KLOWNS, null);
	public static final RegistryObject<Item> TV_HEMAN = block(FbmsModBlocks.TV_HEMAN, null);
	public static final RegistryObject<Item> PIZZA_BOX_85_CLOSED = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_85_CLOSED.getId().getPath(),
			() -> new PizzaBox85ClosedDisplayItem(FbmsModBlocks.PIZZA_BOX_85_CLOSED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PIZZA_BOX_87_CLOSED = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_87_CLOSED.getId().getPath(),
			() -> new PizzaBox87ClosedDisplayItem(FbmsModBlocks.PIZZA_BOX_87_CLOSED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PIZZA_BOX_93_CLOSED = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_93_CLOSED.getId().getPath(),
			() -> new PizzaBox93ClosedDisplayItem(FbmsModBlocks.PIZZA_BOX_93_CLOSED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PIZZA_BOX_24_CLOSED = REGISTRY.register(FbmsModBlocks.PIZZA_BOX_24_CLOSED.getId().getPath(),
			() -> new PizzaBox24ClosedDisplayItem(FbmsModBlocks.PIZZA_BOX_24_CLOSED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DOUG_THE_DOG_ANIMATED = REGISTRY.register(FbmsModBlocks.DOUG_THE_DOG_ANIMATED.getId().getPath(),
			() -> new DougTheDogAnimatedDisplayItem(FbmsModBlocks.DOUG_THE_DOG_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CEILING_LIGHT_ON = block(FbmsModBlocks.CEILING_LIGHT_ON, null);
	public static final RegistryObject<Item> PROJECTION = REGISTRY.register(FbmsModBlocks.PROJECTION.getId().getPath(), () -> new ProjectionDisplayItem(FbmsModBlocks.PROJECTION.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ARCADE_FREDDY = block(FbmsModBlocks.ARCADE_FREDDY, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> ARCADE_FREDDY_ON = block(FbmsModBlocks.ARCADE_FREDDY_ON, null);
	public static final RegistryObject<Item> ARCADE_BONNIE = block(FbmsModBlocks.ARCADE_BONNIE, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> ARCADE_BONNIE_ON = block(FbmsModBlocks.ARCADE_BONNIE_ON, null);
	public static final RegistryObject<Item> ARCADE_FOXY = block(FbmsModBlocks.ARCADE_FOXY, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> ARCADE_FOXY_ON = block(FbmsModBlocks.ARCADE_FOXY_ON, null);
	public static final RegistryObject<Item> PINBALL_TOY_FREDDY = REGISTRY.register(FbmsModBlocks.PINBALL_TOY_FREDDY.getId().getPath(),
			() -> new PinballToyFreddyDisplayItem(FbmsModBlocks.PINBALL_TOY_FREDDY.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> GUS_THE_PUG = REGISTRY.register(FbmsModBlocks.GUS_THE_PUG.getId().getPath(), () -> new GusThePugDisplayItem(FbmsModBlocks.GUS_THE_PUG.get(), new Item.Properties().tab(FbmsModTabs.TAB_FMS)));
	public static final RegistryObject<Item> GUS_THE_PUG_ANIMATED = REGISTRY.register(FbmsModBlocks.GUS_THE_PUG_ANIMATED.getId().getPath(),
			() -> new GusThePugAnimatedDisplayItem(FbmsModBlocks.GUS_THE_PUG_ANIMATED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TAN_BRICKS = block(FbmsModBlocks.TAN_BRICKS, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> WHITE_WALL_TOP = block(FbmsModBlocks.WHITE_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_GRAY_WALL_TOP = block(FbmsModBlocks.LIGHT_GRAY_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BLUE_WALL_TOP = block(FbmsModBlocks.BLUE_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> CYAN_WALL_TOP = block(FbmsModBlocks.CYAN_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GREEN_WALL_TOP = block(FbmsModBlocks.GREEN_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_BLUE_WALL_TOP = block(FbmsModBlocks.LIGHT_BLUE_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> LIME_WALL_TOP = block(FbmsModBlocks.LIME_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> MAGENTA_WALL_TOP = block(FbmsModBlocks.MAGENTA_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> ORANGE_WALL_TOP = block(FbmsModBlocks.ORANGE_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PINK_WALL_TOP = block(FbmsModBlocks.PINK_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> PURPLE_WALL_TOP = block(FbmsModBlocks.PURPLE_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> YELLOW_WALL_TOP = block(FbmsModBlocks.YELLOW_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> YELLOW_WALL = block(FbmsModBlocks.YELLOW_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RETRO_WALL = block(FbmsModBlocks.RETRO_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RETRO_WALL_TOP = block(FbmsModBlocks.RETRO_WALL_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RETRO_WALL_TILES = block(FbmsModBlocks.RETRO_WALL_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BIG_RETRO_WALL_TILES = block(FbmsModBlocks.BIG_RETRO_WALL_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> TAN_BLACK_STRIPE_WALL_TILES = block(FbmsModBlocks.TAN_BLACK_STRIPE_WALL_TILES, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> TAN_BRICKS_TOP = block(FbmsModBlocks.TAN_BRICKS_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> DARK_GRAY_TILE_TOP = block(FbmsModBlocks.DARK_GRAY_TILE_TOP, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> GRAY_RED_STRIPE_WALL = block(FbmsModBlocks.GRAY_RED_STRIPE_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> RETRO_CONFETTI_WALL = block(FbmsModBlocks.RETRO_CONFETTI_WALL, FbmsModTabs.TAB_FMS_BLOCKS);
	public static final RegistryObject<Item> BIG_GRAY_WALL_TILES = block(FbmsModBlocks.BIG_GRAY_WALL_TILES, FbmsModTabs.TAB_FMS_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
