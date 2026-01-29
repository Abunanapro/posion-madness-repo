package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PoisonFrogGoldenOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 200) == 67 && entity.onGround()) {
			{
				Entity _ent = entity;
				_ent.setYRot(Mth.nextInt(RandomSource.create(), 1, 360));
				_ent.setXRot(entity.getXRot());
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.3), 0.5, (entity.getLookAngle().z * 1.3)));
		}
		if (entity.isInWater()) {
			entity.fallDistance = 0;
			if (Mth.nextInt(RandomSource.create(), 1, 100) == 67) {
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.2), 0.1, (entity.getLookAngle().z * 0.2)));
			}
		}
	}
}
