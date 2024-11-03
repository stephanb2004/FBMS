
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fbms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fbms.entity.StationWagonEntity;
import net.mcreator.fbms.entity.SeatEntity;
import net.mcreator.fbms.entity.RatEntity;
import net.mcreator.fbms.entity.MysteriousGiantScuttlersEntity;
import net.mcreator.fbms.entity.ImpalaEntity;
import net.mcreator.fbms.entity.DogeRamEntity;
import net.mcreator.fbms.entity.DfredbearEntity;
import net.mcreator.fbms.entity.DchicaEntity;
import net.mcreator.fbms.entity.DMangleEntity;
import net.mcreator.fbms.entity.DFreddyEntity;
import net.mcreator.fbms.entity.DFoxyEntity;
import net.mcreator.fbms.entity.DBonnieEntity;
import net.mcreator.fbms.FbmsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FbmsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FbmsMod.MODID);
	public static final RegistryObject<EntityType<ImpalaEntity>> IMPALA = register("impala",
			EntityType.Builder.<ImpalaEntity>of(ImpalaEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImpalaEntity::new)

					.sized(3f, 1.5f));
	public static final RegistryObject<EntityType<DogeRamEntity>> DOGE_RAM = register("doge_ram",
			EntityType.Builder.<DogeRamEntity>of(DogeRamEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DogeRamEntity::new)

					.sized(3f, 1.5f));
	public static final RegistryObject<EntityType<StationWagonEntity>> STATION_WAGON = register("station_wagon",
			EntityType.Builder.<StationWagonEntity>of(StationWagonEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StationWagonEntity::new)

					.sized(1f, 1.5f));
	public static final RegistryObject<EntityType<DFreddyEntity>> D_FREDDY = register("d_freddy",
			EntityType.Builder.<DFreddyEntity>of(DFreddyEntity::new, MobCategory.AXOLOTLS).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DBonnieEntity>> D_BONNIE = register("d_bonnie",
			EntityType.Builder.<DBonnieEntity>of(DBonnieEntity::new, MobCategory.AXOLOTLS).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DchicaEntity>> DCHICA = register("dchica",
			EntityType.Builder.<DchicaEntity>of(DchicaEntity::new, MobCategory.AXOLOTLS).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DchicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DFoxyEntity>> D_FOXY = register("d_foxy",
			EntityType.Builder.<DFoxyEntity>of(DFoxyEntity::new, MobCategory.AXOLOTLS).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DfredbearEntity>> DFREDBEAR = register("dfredbear",
			EntityType.Builder.<DfredbearEntity>of(DfredbearEntity::new, MobCategory.AXOLOTLS).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DfredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DMangleEntity>> D_MANGLE = register("d_mangle",
			EntityType.Builder.<DMangleEntity>of(DMangleEntity::new, MobCategory.AXOLOTLS).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DMangleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RatEntity>> RAT = register("rat",
			EntityType.Builder.<RatEntity>of(RatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MysteriousGiantScuttlersEntity>> MYSTERIOUS_GIANT_SCUTTLERS = register("mysterious_giant_scuttlers",
			EntityType.Builder.<MysteriousGiantScuttlersEntity>of(MysteriousGiantScuttlersEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MysteriousGiantScuttlersEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SeatEntity>> SEAT = register("seat",
			EntityType.Builder.<SeatEntity>of(SeatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeatEntity::new)

					.sized(0.5f, 0.375f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ImpalaEntity.init();
			DogeRamEntity.init();
			StationWagonEntity.init();
			DFreddyEntity.init();
			DBonnieEntity.init();
			DchicaEntity.init();
			DFoxyEntity.init();
			DfredbearEntity.init();
			DMangleEntity.init();
			RatEntity.init();
			MysteriousGiantScuttlersEntity.init();
			SeatEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(IMPALA.get(), ImpalaEntity.createAttributes().build());
		event.put(DOGE_RAM.get(), DogeRamEntity.createAttributes().build());
		event.put(STATION_WAGON.get(), StationWagonEntity.createAttributes().build());
		event.put(D_FREDDY.get(), DFreddyEntity.createAttributes().build());
		event.put(D_BONNIE.get(), DBonnieEntity.createAttributes().build());
		event.put(DCHICA.get(), DchicaEntity.createAttributes().build());
		event.put(D_FOXY.get(), DFoxyEntity.createAttributes().build());
		event.put(DFREDBEAR.get(), DfredbearEntity.createAttributes().build());
		event.put(D_MANGLE.get(), DMangleEntity.createAttributes().build());
		event.put(RAT.get(), RatEntity.createAttributes().build());
		event.put(MYSTERIOUS_GIANT_SCUTTLERS.get(), MysteriousGiantScuttlersEntity.createAttributes().build());
		event.put(SEAT.get(), SeatEntity.createAttributes().build());
	}
}
