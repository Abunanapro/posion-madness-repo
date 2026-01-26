package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PoisonFrogGoldenOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 400) == 67 && entity.onGround()) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.3), 0.5, (entity.getLookAngle().z * 1.3)));
		}
		if (entity.isInWater()) {
			entity.fallDistance = 0;
		}
	}
}
