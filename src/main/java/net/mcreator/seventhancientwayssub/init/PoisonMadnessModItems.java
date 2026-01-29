
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.seventhancientwayssub.procedures.DartstadartPropertyValueProviderProcedure;
import net.mcreator.seventhancientwayssub.item.YellowFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.VioletFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.RedWhiteFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.RedFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.PoisonCodexItem;
import net.mcreator.seventhancientwayssub.item.PinkFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.OrangeFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.LightGreenToadBowlItem;
import net.mcreator.seventhancientwayssub.item.JustUsedForTextureItem;
import net.mcreator.seventhancientwayssub.item.GreenToadBowlItem;
import net.mcreator.seventhancientwayssub.item.GoldenFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.GeenFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.DartstadartItem;
import net.mcreator.seventhancientwayssub.item.DarkPurpleFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.DarkFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.CyanFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.CrimsonFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.CommonFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.CoatedDartItem;
import net.mcreator.seventhancientwayssub.item.BrownLizardBowlItem;
import net.mcreator.seventhancientwayssub.item.BlueFrogBowlItem;
import net.mcreator.seventhancientwayssub.item.BlackSpiderBowlItem;
import net.mcreator.seventhancientwayssub.item.BlackLizardBowlItem;
import net.mcreator.seventhancientwayssub.item.Black2LizardBowlItem;
import net.mcreator.seventhancientwayssub.item.AdvancementItem1Item;
import net.mcreator.seventhancientwayssub.item.Advancement2Item;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PoisonMadnessModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PoisonMadnessMod.MODID);
	public static final RegistryObject<Item> GOLDEN_FROG_BOWL = REGISTRY.register("golden_frog_bowl", () -> new GoldenFrogBowlItem());
	public static final RegistryObject<Item> BLUE_FROG_BOWL = REGISTRY.register("blue_frog_bowl", () -> new BlueFrogBowlItem());
	public static final RegistryObject<Item> ORANGE_FROG_BOWL = REGISTRY.register("orange_frog_bowl", () -> new OrangeFrogBowlItem());
	public static final RegistryObject<Item> CRIMSON_FROG_BOWL = REGISTRY.register("crimson_frog_bowl", () -> new CrimsonFrogBowlItem());
	public static final RegistryObject<Item> RED_FROG_BOWL = REGISTRY.register("red_frog_bowl", () -> new RedFrogBowlItem());
	public static final RegistryObject<Item> GEEN_FROG_BOWL = REGISTRY.register("geen_frog_bowl", () -> new GeenFrogBowlItem());
	public static final RegistryObject<Item> PINK_FROG_BOWL = REGISTRY.register("pink_frog_bowl", () -> new PinkFrogBowlItem());
	public static final RegistryObject<Item> VIOLET_FROG_BOWL = REGISTRY.register("violet_frog_bowl", () -> new VioletFrogBowlItem());
	public static final RegistryObject<Item> DARK_FROG_BOWL = REGISTRY.register("dark_frog_bowl", () -> new DarkFrogBowlItem());
	public static final RegistryObject<Item> CYAN_FROG_BOWL = REGISTRY.register("cyan_frog_bowl", () -> new CyanFrogBowlItem());
	public static final RegistryObject<Item> COMMON_FROG_BOWL = REGISTRY.register("common_frog_bowl", () -> new CommonFrogBowlItem());
	public static final RegistryObject<Item> DARK_PURPLE_FROG_BOWL = REGISTRY.register("dark_purple_frog_bowl", () -> new DarkPurpleFrogBowlItem());
	public static final RegistryObject<Item> YELLOW_FROG_BOWL = REGISTRY.register("yellow_frog_bowl", () -> new YellowFrogBowlItem());
	public static final RegistryObject<Item> RED_WHITE_FROG_BOWL = REGISTRY.register("red_white_frog_bowl", () -> new RedWhiteFrogBowlItem());
	public static final RegistryObject<Item> BLACK_LIZARD_BOWL = REGISTRY.register("black_lizard_bowl", () -> new BlackLizardBowlItem());
	public static final RegistryObject<Item> BLACK_2_LIZARD_BOWL = REGISTRY.register("black_2_lizard_bowl", () -> new Black2LizardBowlItem());
	public static final RegistryObject<Item> BROWN_LIZARD_BOWL = REGISTRY.register("brown_lizard_bowl", () -> new BrownLizardBowlItem());
	public static final RegistryObject<Item> GREEN_TOAD_BOWL = REGISTRY.register("green_toad_bowl", () -> new GreenToadBowlItem());
	public static final RegistryObject<Item> BLACK_SPIDER_BOWL = REGISTRY.register("black_spider_bowl", () -> new BlackSpiderBowlItem());
	public static final RegistryObject<Item> DARTSTADART = REGISTRY.register("dartstadart", () -> new DartstadartItem());
	public static final RegistryObject<Item> POISON_FROG_GOLDEN_SPAWN_EGG = REGISTRY.register("poison_frog_golden_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_GOLDEN, -2829312, -10066432, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_BLUE_SPAWN_EGG = REGISTRY.register("poison_frog_blue_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_BLUE, -15859457, -11571457, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_ORANGE_SPAWN_EGG = REGISTRY.register("poison_frog_orange_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_ORANGE, -31232, -13688320, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_CRIMSON_SPAWN_EGG = REGISTRY.register("poison_frog_crimson_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_CRIMSON, -10092544, -1, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_RED_SPAWN_EGG = REGISTRY.register("poison_frog_red_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_RED, -52429, -13408513, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_GREEN_SPAWN_EGG = REGISTRY.register("poison_frog_green_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_GREEN, -16724992, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_PINK_SPAWN_EGG = REGISTRY.register("poison_frog_pink_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_PINK, -7601921, -5298993, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_DARK_SPAWN_EGG = REGISTRY.register("poison_frog_dark_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_DARK, -256, -13948117, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_VIOLET_SPAWN_EGG = REGISTRY.register("poison_frog_violet_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_VIOLET, -4325121, -5603072, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_CYAN_SPAWN_EGG = REGISTRY.register("poison_frog_cyan_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_CYAN, -256, -10066432, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_COMMON_SPAWN_EGG = REGISTRY.register("poison_frog_common_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_COMMON, -10253728, -16239104, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_DARK_PURPLE_SPAWN_EGG = REGISTRY.register("poison_frog_dark_purple_spawn_egg",
			() -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_DARK_PURPLE, -11980970, -14483402, new Item.Properties()));
	public static final RegistryObject<Item> POISON_FROG_YELLOW_SPAWN_EGG = REGISTRY.register("poison_frog_yellow_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_YELLOW, -16053504, -10066432, new Item.Properties()));
	public static final RegistryObject<Item> LIZARD_BLACK_SPAWN_EGG = REGISTRY.register("lizard_black_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.LIZARD_BLACK, -13395712, -10092340, new Item.Properties()));
	public static final RegistryObject<Item> GREEN_TOAD_SPAWN_EGG = REGISTRY.register("green_toad_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.GREEN_TOAD, -16751104, -16764160, new Item.Properties()));
	public static final RegistryObject<Item> SPIDER_BLACK_SPAWN_EGG = REGISTRY.register("spider_black_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.SPIDER_BLACK, -16777216, -11842741, new Item.Properties()));
	public static final RegistryObject<Item> COATED_DART = REGISTRY.register("coated_dart", () -> new CoatedDartItem());
	public static final RegistryObject<Item> RITUAL_TABLE_CENTER = block(PoisonMadnessModBlocks.RITUAL_TABLE_CENTER);
	public static final RegistryObject<Item> POISON_FROG_RED_WHITE_SPAWN_EGG = REGISTRY.register("poison_frog_red_white_spawn_egg",
			() -> new ForgeSpawnEggItem(PoisonMadnessModEntities.POISON_FROG_RED_WHITE, -3407821, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> POISON_CRAFT_TABLE = block(PoisonMadnessModBlocks.POISON_CRAFT_TABLE);
	public static final RegistryObject<Item> LIZARD_BLACK_2_SPAWN_EGG = REGISTRY.register("lizard_black_2_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.LIZARD_BLACK_2, -13421773, -6750208, new Item.Properties()));
	public static final RegistryObject<Item> LIZARD_BROWN_SPAWN_EGG = REGISTRY.register("lizard_brown_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.LIZARD_BROWN, -13421824, -3368704, new Item.Properties()));
	public static final RegistryObject<Item> JUST_USED_FOR_TEXTURE = REGISTRY.register("just_used_for_texture", () -> new JustUsedForTextureItem());
	public static final RegistryObject<Item> ADVANCEMENT_ITEM_1 = REGISTRY.register("advancement_item_1", () -> new AdvancementItem1Item());
	public static final RegistryObject<Item> ADVANCEMENT_2 = REGISTRY.register("advancement_2", () -> new Advancement2Item());
	public static final RegistryObject<Item> LIGHT_GREEN_TOAD_SPAWN_EGG = REGISTRY.register("light_green_toad_spawn_egg", () -> new ForgeSpawnEggItem(PoisonMadnessModEntities.LIGHT_GREEN_TOAD, -16711936, -16764160, new Item.Properties()));
	public static final RegistryObject<Item> LIGHT_GREEN_TOAD_BOWL = REGISTRY.register("light_green_toad_bowl", () -> new LightGreenToadBowlItem());
	public static final RegistryObject<Item> POISON_CODEX = REGISTRY.register("poison_codex", () -> new PoisonCodexItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(DARTSTADART.get(), new ResourceLocation("poison_madness:dartstadart_coated"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) DartstadartPropertyValueProviderProcedure.execute(itemStackToRender));
		});
	}
}
