
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
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fbms.item.WandItem;
import net.mcreator.fbms.item.TrumpetItem;
import net.mcreator.fbms.item.ToyMicItem;
import net.mcreator.fbms.item.RemoteItem;
import net.mcreator.fbms.item.MaracasItem;
import net.mcreator.fbms.item.MandolinItem;
import net.mcreator.fbms.item.GuitarItem;
import net.mcreator.fbms.item.FATItem;
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
import net.mcreator.fbms.block.display.ShredBearDisplayItem;
import net.mcreator.fbms.block.display.SecurityPuppetDisplayItem;
import net.mcreator.fbms.block.display.ScrapTrapDisplayItem;
import net.mcreator.fbms.block.display.SanitationStationDisplayItem;
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
import net.mcreator.fbms.block.display.RascDisplayItem;
import net.mcreator.fbms.block.display.PuppetBoxDisplayItem;
import net.mcreator.fbms.block.display.PuffyPuffinsDisplayItem;
import net.mcreator.fbms.block.display.PuffyPuffinsAnimatedDisplayItem;
import net.mcreator.fbms.block.display.PrizeKingDisplayItem;
import net.mcreator.fbms.block.display.PizzaPlaceSignOldDisplayItem;
import net.mcreator.fbms.block.display.PizzaPlaceSignDisplayItem;
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
import net.mcreator.fbms.block.display.NeonStageLightsBlueDisplayItem;
import net.mcreator.fbms.block.display.NeonStageLightGreenDisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet4DisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet3DisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet2DisplayItem;
import net.mcreator.fbms.block.display.NeonPartySet1DisplayItem;
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
import net.mcreator.fbms.block.display.JeffsPizzaSignDisplayItem;
import net.mcreator.fbms.block.display.ImpalaBlockDisplayItem;
import net.mcreator.fbms.block.display.IgnitedChicaDisplayItem;
import net.mcreator.fbms.block.display.HazyReindeerDisplayItem;
import net.mcreator.fbms.block.display.HazyReindeerAnimatedDisplayItem;
import net.mcreator.fbms.block.display.HappyFrogDisplayItem;
import net.mcreator.fbms.block.display.HappYFrogAnimatedDisplayItem;
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
import net.mcreator.fbms.block.display.CeilingStageLightsDisplayItem;
import net.mcreator.fbms.block.display.CeilingStageLightpinkDisplayItem;
import net.mcreator.fbms.block.display.CeilingStageLightblueDisplayItem;
import net.mcreator.fbms.block.display.CarnivalHoopsDisplayItem;
import net.mcreator.fbms.block.display.CandyCadetDisplayItem;
import net.mcreator.fbms.block.display.BuffetEndoDisplayItem;
import net.mcreator.fbms.block.display.BucketBobDisplayItem;
import net.mcreator.fbms.block.display.BrokenFreddyDisplayItem;
import net.mcreator.fbms.block.display.BrokenChicaDisplayItem;
import net.mcreator.fbms.block.display.BrokenBonnieDisplayItem;
import net.mcreator.fbms.block.display.BrokenBarryPolarAnimatedDisplayItem;
import net.mcreator.fbms.block.display.BonnieDisplayItem;
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
	public static final RegistryObject<Item> RED_STAGE_BLOCK = block(FbmsModBlocks.RED_STAGE_BLOCK, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> PURPLE_STAGE_BLOCK = block(FbmsModBlocks.PURPLE_STAGE_BLOCK, FbmsModTabs.TAB_SHOP_BLOCKS);
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
	public static final RegistryObject<Item> NEON_JUKE_BOX = REGISTRY.register(FbmsModBlocks.NEON_JUKE_BOX.getId().getPath(),
			() -> new NeonJukeBoxDisplayItem(FbmsModBlocks.NEON_JUKE_BOX.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_STAGE_LIGHT_GREEN = REGISTRY.register(FbmsModBlocks.NEON_STAGE_LIGHT_GREEN.getId().getPath(),
			() -> new NeonStageLightGreenDisplayItem(FbmsModBlocks.NEON_STAGE_LIGHT_GREEN.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_STAGE_LIGHTS_PINK = REGISTRY.register(FbmsModBlocks.NEON_STAGE_LIGHTS_PINK.getId().getPath(),
			() -> new NeonStageLightsPinkDisplayItem(FbmsModBlocks.NEON_STAGE_LIGHTS_PINK.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NEON_STAGE_LIGHTS_BLUE = REGISTRY.register(FbmsModBlocks.NEON_STAGE_LIGHTS_BLUE.getId().getPath(),
			() -> new NeonStageLightsBlueDisplayItem(FbmsModBlocks.NEON_STAGE_LIGHTS_BLUE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CEILING_STAGE_LIGHTS = REGISTRY.register(FbmsModBlocks.CEILING_STAGE_LIGHTS.getId().getPath(),
			() -> new CeilingStageLightsDisplayItem(FbmsModBlocks.CEILING_STAGE_LIGHTS.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CEILING_STAGE_LIGHTPINK = REGISTRY.register(FbmsModBlocks.CEILING_STAGE_LIGHTPINK.getId().getPath(),
			() -> new CeilingStageLightpinkDisplayItem(FbmsModBlocks.CEILING_STAGE_LIGHTPINK.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> CEILING_STAGE_LIGHTBLUE = REGISTRY.register(FbmsModBlocks.CEILING_STAGE_LIGHTBLUE.getId().getPath(),
			() -> new CeilingStageLightblueDisplayItem(FbmsModBlocks.CEILING_STAGE_LIGHTBLUE.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> NOVELTY_TRAFFIC_LIGHT = REGISTRY.register(FbmsModBlocks.NOVELTY_TRAFFIC_LIGHT.getId().getPath(),
			() -> new NoveltyTrafficLightDisplayItem(FbmsModBlocks.NOVELTY_TRAFFIC_LIGHT.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));
	public static final RegistryObject<Item> R_FREDDY_POSTER = block(FbmsModBlocks.R_FREDDY_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> RBONNIE_POSTER = block(FbmsModBlocks.RBONNIE_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> R_CHICA_POSTER = block(FbmsModBlocks.R_CHICA_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> R_FOXY_POSTER = block(FbmsModBlocks.R_FOXY_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> LEFTY_POSTER = block(FbmsModBlocks.LEFTY_POSTER, FbmsModTabs.TAB_SHOP_BLOCKS);
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
	public static final RegistryObject<Item> IMPALA_SPAWN_EGG = REGISTRY.register("impala_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.IMPALA, -6750055, -10092442, new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> IMPALA_BLOCK = REGISTRY.register(FbmsModBlocks.IMPALA_BLOCK.getId().getPath(), () -> new ImpalaBlockDisplayItem(FbmsModBlocks.IMPALA_BLOCK.get(), new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> DOGE_RAM_SPAWN_EGG = REGISTRY.register("doge_ram_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.DOGE_RAM, -13434625, -16777012, new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> DOGE_RAM_BLOCK = REGISTRY.register(FbmsModBlocks.DOGE_RAM_BLOCK.getId().getPath(), () -> new DogeRamBlockDisplayItem(FbmsModBlocks.DOGE_RAM_BLOCK.get(), new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> STATION_WAGON_SPAWN_EGG = REGISTRY.register("station_wagon_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.STATION_WAGON, -6724096, -3381760, new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> STATION_WAGON_BLOCK = REGISTRY.register(FbmsModBlocks.STATION_WAGON_BLOCK.getId().getPath(),
			() -> new StationWagonBlockDisplayItem(FbmsModBlocks.STATION_WAGON_BLOCK.get(), new Item.Properties().tab(FbmsModTabs.TAB_CARS)));
	public static final RegistryObject<Item> D_FREDDY_SPAWN_EGG = REGISTRY.register("d_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FbmsModEntities.D_FREDDY, -1, -1, new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM)));
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
	public static final RegistryObject<Item> MONITORS_STEPHAN = block(FbmsModBlocks.MONITORS_STEPHAN, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> MONITORS_LOLBIT = block(FbmsModBlocks.MONITORS_LOLBIT, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_OFF = block(FbmsModBlocks.TV_OFF, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV = block(FbmsModBlocks.TV, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_DOUG = block(FbmsModBlocks.TV_DOUG, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_MARCELO = block(FbmsModBlocks.TV_MARCELO, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_FIZ_TIME = block(FbmsModBlocks.TV_FIZ_TIME, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_MARTY = block(FbmsModBlocks.TV_MARTY, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_FLOS = block(FbmsModBlocks.TV_FLOS, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_WART_PASTE = block(FbmsModBlocks.TV_WART_PASTE, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_LALLY = block(FbmsModBlocks.TV_LALLY, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_POP_CORN = block(FbmsModBlocks.TV_POP_CORN, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_FREDDY_N_FREN = block(FbmsModBlocks.TV_FREDDY_N_FREN, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_IATR = block(FbmsModBlocks.TV_IATR, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_NEWS = block(FbmsModBlocks.TV_NEWS, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> MONITOR_LOLBIT = block(FbmsModBlocks.MONITOR_LOLBIT, FbmsModTabs.TAB_PRIVATE_ROOM);
	public static final RegistryObject<Item> TV_LOLBIT = block(FbmsModBlocks.TV_LOLBIT, FbmsModTabs.TAB_PRIVATE_ROOM);
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
	public static final RegistryObject<Item> DOC_PLUSH = REGISTRY.register(FbmsModBlocks.DOC_PLUSH.getId().getPath(), () -> new DocPlushDisplayItem(FbmsModBlocks.DOC_PLUSH.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> GARF_PLUSH = REGISTRY.register(FbmsModBlocks.GARF_PLUSH.getId().getPath(), () -> new GarfPlushDisplayItem(FbmsModBlocks.GARF_PLUSH.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> ROSEY = REGISTRY.register(FbmsModBlocks.ROSEY.getId().getPath(), () -> new RoseyDisplayItem(FbmsModBlocks.ROSEY.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> VESSEL = block(FbmsModBlocks.VESSEL, FbmsModTabs.TAB_PLUSH);
	public static final RegistryObject<Item> STEPHAN_PLUSH = REGISTRY.register(FbmsModBlocks.STEPHAN_PLUSH.getId().getPath(), () -> new StephanPlushDisplayItem(FbmsModBlocks.STEPHAN_PLUSH.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
	public static final RegistryObject<Item> DOLLS = REGISTRY.register(FbmsModBlocks.DOLLS.getId().getPath(), () -> new DollsDisplayItem(FbmsModBlocks.DOLLS.get(), new Item.Properties().tab(FbmsModTabs.TAB_PLUSH)));
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
	public static final RegistryObject<Item> SCRAP_STAGE_BLOCK = block(FbmsModBlocks.SCRAP_STAGE_BLOCK, FbmsModTabs.TAB_SHOP_BLOCKS);
	public static final RegistryObject<Item> COIN = REGISTRY.register(FbmsModBlocks.COIN.getId().getPath(), () -> new CoinDisplayItem(FbmsModBlocks.COIN.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_5 = REGISTRY.register(FbmsModBlocks.COINS_5.getId().getPath(), () -> new Coins5DisplayItem(FbmsModBlocks.COINS_5.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_100 = REGISTRY.register(FbmsModBlocks.COINS_100.getId().getPath(), () -> new Coins25DisplayItem(FbmsModBlocks.COINS_100.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_25 = REGISTRY.register(FbmsModBlocks.COINS_25.getId().getPath(), () -> new Coins100DisplayItem(FbmsModBlocks.COINS_25.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_1000 = REGISTRY.register(FbmsModBlocks.COINS_1000.getId().getPath(), () -> new Coins1000DisplayItem(FbmsModBlocks.COINS_1000.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> COINS_10000 = REGISTRY.register(FbmsModBlocks.COINS_10000.getId().getPath(), () -> new Coins10000DisplayItem(FbmsModBlocks.COINS_10000.get(), new Item.Properties().tab(FbmsModTabs.TAB_PROPS)));
	public static final RegistryObject<Item> MEGAULTIMATESPEAKERTRON_3000 = REGISTRY.register(FbmsModBlocks.MEGAULTIMATESPEAKERTRON_3000.getId().getPath(),
			() -> new Megaultimatespeakertron3000DisplayItem(FbmsModBlocks.MEGAULTIMATESPEAKERTRON_3000.get(), new Item.Properties().tab(FbmsModTabs.TAB_SHOP_BLOCKS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
