package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class RitualTableCenterUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double change = 0;
		BlockState desieredblock = Blocks.AIR.defaultBlockState();
		change = 1;
		desieredblock = Blocks.MAGMA_BLOCK.defaultBlockState();
		if ((world.getBlockState(BlockPos.containing(x + change, y, z))).getBlock() == desieredblock.getBlock() && (world.getBlockState(BlockPos.containing(x, y, z + change))).getBlock() == desieredblock.getBlock()) {
			change = -1;
			if ((world.getBlockState(BlockPos.containing(x + change, y, z))).getBlock() == desieredblock.getBlock() && (world.getBlockState(BlockPos.containing(x, y, z + change))).getBlock() == desieredblock.getBlock()) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
