package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.Entity;

public class PoisonFrogGoldenEntityFallsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
