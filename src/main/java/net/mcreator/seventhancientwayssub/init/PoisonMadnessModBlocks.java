
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.seventhancientwayssub.block.RitualTableCenterBlock;
import net.mcreator.seventhancientwayssub.block.PoisonCraftTableBlock;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PoisonMadnessMod.MODID);
	public static final RegistryObject<Block> RITUAL_TABLE_CENTER = REGISTRY.register("ritual_table_center", () -> new RitualTableCenterBlock());
	public static final RegistryObject<Block> POISON_CRAFT_TABLE = REGISTRY.register("poison_craft_table", () -> new PoisonCraftTableBlock());
}
