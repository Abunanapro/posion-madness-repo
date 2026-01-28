
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

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

import net.mcreator.seventhancientwayssub.entity.SpiderBlackEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogYellowEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogVioletEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogRedWhiteEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogRedEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogPinkEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogOrangeEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogGreenEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogGoldenEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogDarkPurpleEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogDarkEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogCyanEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogCrimsonEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogCommonEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogBlueEntity;
import net.mcreator.seventhancientwayssub.entity.LizardBrownEntity;
import net.mcreator.seventhancientwayssub.entity.LizardBlackEntity;
import net.mcreator.seventhancientwayssub.entity.LizardBlack2Entity;
import net.mcreator.seventhancientwayssub.entity.GreenToadEntity;
import net.mcreator.seventhancientwayssub.entity.DartEntity;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoisonMadnessModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PoisonMadnessMod.MODID);
	public static final RegistryObject<EntityType<PoisonFrogGoldenEntity>> POISON_FROG_GOLDEN = register("poison_frog_golden",
			EntityType.Builder.<PoisonFrogGoldenEntity>of(PoisonFrogGoldenEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogGoldenEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogBlueEntity>> POISON_FROG_BLUE = register("poison_frog_blue",
			EntityType.Builder.<PoisonFrogBlueEntity>of(PoisonFrogBlueEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogBlueEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogOrangeEntity>> POISON_FROG_ORANGE = register("poison_frog_orange",
			EntityType.Builder.<PoisonFrogOrangeEntity>of(PoisonFrogOrangeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogOrangeEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogCrimsonEntity>> POISON_FROG_CRIMSON = register("poison_frog_crimson",
			EntityType.Builder.<PoisonFrogCrimsonEntity>of(PoisonFrogCrimsonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogCrimsonEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogRedEntity>> POISON_FROG_RED = register("poison_frog_red",
			EntityType.Builder.<PoisonFrogRedEntity>of(PoisonFrogRedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogRedEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogGreenEntity>> POISON_FROG_GREEN = register("poison_frog_green",
			EntityType.Builder.<PoisonFrogGreenEntity>of(PoisonFrogGreenEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogGreenEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogPinkEntity>> POISON_FROG_PINK = register("poison_frog_pink",
			EntityType.Builder.<PoisonFrogPinkEntity>of(PoisonFrogPinkEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogPinkEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogDarkEntity>> POISON_FROG_DARK = register("poison_frog_dark",
			EntityType.Builder.<PoisonFrogDarkEntity>of(PoisonFrogDarkEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogDarkEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogVioletEntity>> POISON_FROG_VIOLET = register("poison_frog_violet",
			EntityType.Builder.<PoisonFrogVioletEntity>of(PoisonFrogVioletEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogVioletEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogCyanEntity>> POISON_FROG_CYAN = register("poison_frog_cyan",
			EntityType.Builder.<PoisonFrogCyanEntity>of(PoisonFrogCyanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogCyanEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogCommonEntity>> POISON_FROG_COMMON = register("poison_frog_common",
			EntityType.Builder.<PoisonFrogCommonEntity>of(PoisonFrogCommonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogCommonEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogDarkPurpleEntity>> POISON_FROG_DARK_PURPLE = register("poison_frog_dark_purple",
			EntityType.Builder.<PoisonFrogDarkPurpleEntity>of(PoisonFrogDarkPurpleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(PoisonFrogDarkPurpleEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogYellowEntity>> POISON_FROG_YELLOW = register("poison_frog_yellow",
			EntityType.Builder.<PoisonFrogYellowEntity>of(PoisonFrogYellowEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogYellowEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<LizardBlackEntity>> LIZARD_BLACK = register("lizard_black",
			EntityType.Builder.<LizardBlackEntity>of(LizardBlackEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LizardBlackEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<GreenToadEntity>> GREEN_TOAD = register("green_toad",
			EntityType.Builder.<GreenToadEntity>of(GreenToadEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenToadEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<SpiderBlackEntity>> SPIDER_BLACK = register("spider_black",
			EntityType.Builder.<SpiderBlackEntity>of(SpiderBlackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderBlackEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<DartEntity>> DART = register("projectile_dart",
			EntityType.Builder.<DartEntity>of(DartEntity::new, MobCategory.MISC).setCustomClientFactory(DartEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PoisonFrogRedWhiteEntity>> POISON_FROG_RED_WHITE = register("poison_frog_red_white",
			EntityType.Builder.<PoisonFrogRedWhiteEntity>of(PoisonFrogRedWhiteEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogRedWhiteEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<LizardBlack2Entity>> LIZARD_BLACK_2 = register("lizard_black_2",
			EntityType.Builder.<LizardBlack2Entity>of(LizardBlack2Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LizardBlack2Entity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<LizardBrownEntity>> LIZARD_BROWN = register("lizard_brown",
			EntityType.Builder.<LizardBrownEntity>of(LizardBrownEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LizardBrownEntity::new)

					.sized(0.6f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PoisonFrogGoldenEntity.init();
			PoisonFrogBlueEntity.init();
			PoisonFrogOrangeEntity.init();
			PoisonFrogCrimsonEntity.init();
			PoisonFrogRedEntity.init();
			PoisonFrogGreenEntity.init();
			PoisonFrogPinkEntity.init();
			PoisonFrogDarkEntity.init();
			PoisonFrogVioletEntity.init();
			PoisonFrogCyanEntity.init();
			PoisonFrogCommonEntity.init();
			PoisonFrogDarkPurpleEntity.init();
			PoisonFrogYellowEntity.init();
			LizardBlackEntity.init();
			GreenToadEntity.init();
			SpiderBlackEntity.init();
			PoisonFrogRedWhiteEntity.init();
			LizardBlack2Entity.init();
			LizardBrownEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(POISON_FROG_GOLDEN.get(), PoisonFrogGoldenEntity.createAttributes().build());
		event.put(POISON_FROG_BLUE.get(), PoisonFrogBlueEntity.createAttributes().build());
		event.put(POISON_FROG_ORANGE.get(), PoisonFrogOrangeEntity.createAttributes().build());
		event.put(POISON_FROG_CRIMSON.get(), PoisonFrogCrimsonEntity.createAttributes().build());
		event.put(POISON_FROG_RED.get(), PoisonFrogRedEntity.createAttributes().build());
		event.put(POISON_FROG_GREEN.get(), PoisonFrogGreenEntity.createAttributes().build());
		event.put(POISON_FROG_PINK.get(), PoisonFrogPinkEntity.createAttributes().build());
		event.put(POISON_FROG_DARK.get(), PoisonFrogDarkEntity.createAttributes().build());
		event.put(POISON_FROG_VIOLET.get(), PoisonFrogVioletEntity.createAttributes().build());
		event.put(POISON_FROG_CYAN.get(), PoisonFrogCyanEntity.createAttributes().build());
		event.put(POISON_FROG_COMMON.get(), PoisonFrogCommonEntity.createAttributes().build());
		event.put(POISON_FROG_DARK_PURPLE.get(), PoisonFrogDarkPurpleEntity.createAttributes().build());
		event.put(POISON_FROG_YELLOW.get(), PoisonFrogYellowEntity.createAttributes().build());
		event.put(LIZARD_BLACK.get(), LizardBlackEntity.createAttributes().build());
		event.put(GREEN_TOAD.get(), GreenToadEntity.createAttributes().build());
		event.put(SPIDER_BLACK.get(), SpiderBlackEntity.createAttributes().build());
		event.put(POISON_FROG_RED_WHITE.get(), PoisonFrogRedWhiteEntity.createAttributes().build());
		event.put(LIZARD_BLACK_2.get(), LizardBlack2Entity.createAttributes().build());
		event.put(LIZARD_BROWN.get(), LizardBrownEntity.createAttributes().build());
	}
}
