
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.seventhancientwayssub.block.entity.PoisonCraftTableBlockEntity;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PoisonMadnessMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> POISON_CRAFT_TABLE = register("poison_craft_table", PoisonMadnessModBlocks.POISON_CRAFT_TABLE, PoisonCraftTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
